package util.dddSupport.usecase

import scala.concurrent.ExecutionContext

trait UseCase {

  type Input
  type Output

  protected def call(arg: Input)(implicit ec: ExecutionContext): Output
}
