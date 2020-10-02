import adapter.input.controller.user.UserController
import domainInterface.usecase.user.CreateUserUseCase
import usecase.user.CreateUserUseCaseImpl
import domainInterface.adapter.ioGateway.UserRepository

object Main {

  def main(args: Array[String]): Unit = {
    // UserRepository ← dummy
    // ↓
    // CreateUserUseCase ← CreateUserUseCaseImpl
    // ↓
    // UserController << call/return >> CreateUserResultPresenter

    println(msg)
  }

  def msg = "I was compiled by dotty :)"

}
