package util.dddSupport.usecase

import scala.concurrent.ExecutionContext

trait PullPort[PullArg, Arg, Result] {
  self: UseCase =>

  override final type Input = Arg

  override final type Output = Result

  def execute(arg: PullArg => Arg)(implicit ec: ExecutionContext): Result =
    call(arg(pullArg))

  protected def pullArg: PullArg
}
