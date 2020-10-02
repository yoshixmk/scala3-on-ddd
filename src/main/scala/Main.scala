import adapter.input.controller.user.UserController
import domainInterface.usecase.user.CreateUserUseCase
import usecase.user.CreateUserUseCaseImpl
import domainInterface.adapter.ioGateway.UserRepositoryImpl
import adapter.output.presenter.user.CreateUserResultPresenterImpl

object Main {

  def main(args: Array[String]): Unit = {
    // UserRepository ← dummy
    // ↓
    // CreateUserUseCase ← CreateUserUseCaseImpl
    // ↓
    // UserController << call/return >> CreateUserResultPresenter

    object DddFamily {
      private val repository = UserRepositoryImpl()

      private val usecase = CreateUserUseCaseImpl(repository)

      private val presenter = CreateUserResultPresenterImpl()

      val controller = UserController(usecase, presenter)

      def execute() = controller.create
    }

    println(DddFamily.execute())
  }

}
