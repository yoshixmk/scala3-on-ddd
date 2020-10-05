import adapter.input.controller.user.UserController
import domainInterface.usecase.user.CreateUserUseCase
import usecase.user.CreateUserUseCaseImpl
import adapter.ioGateway.repository.user.UserRepositoryImpl
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

      def execute() = {
        val newUser = controller.create
        println(s"created user. id = ${newUser.id.value} name = ${newUser.name}")
      }
    }

    DddFamily.execute()
  }

}
