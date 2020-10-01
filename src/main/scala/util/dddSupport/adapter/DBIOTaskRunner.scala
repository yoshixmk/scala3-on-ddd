package util.dddSupport.adapter

import scala.concurrent.{ ExecutionContext, Future }
import scala.language.higherKinds

/**
  * DB用のTaskRunner
  * @tparam M Monad
  */
trait DBIOTaskRunner[M[+_]] {

  def run[R](a: M[R])(implicit ctx: ExecutionContext): Future[R]

  def runSeq[R](as: M[Seq[R]])(implicit ctx: ExecutionContext): Future[Seq[R]]

  def runTransaction[R](a: M[R])(implicit ctx: ExecutionContext): Future[R]
}
