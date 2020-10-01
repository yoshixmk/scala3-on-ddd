package util.dddSupport.adapter.output.presenter

import scala.concurrent.{ ExecutionContext, Future }

trait Presenter[A, R] {

  type Arg = A
  type Rendered = R

  def response(arg: Arg)(implicit ec: ExecutionContext): Future[Rendered]
}
