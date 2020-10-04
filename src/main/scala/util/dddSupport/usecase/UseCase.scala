package util.dddSupport.usecase

trait UseCase {

  type Input
  type Output

  def call(arg: Input): Output
}
