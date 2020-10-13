import adapter.input.controller.user.UserController
import domainInterface.usecase.user.CreateUserUseCase
import usecase.user._
import adapter.ioGateway.repository.user.UserRepositoryImpl
import adapter.output.presenter.user._

object Main {

  def main(args: Array[String]): Unit = {
    // UserRepository ← dummy
    // ↓
    // CreateUserUseCase ← CreateUserUseCaseImpl
    // ↓
    // UserController << call/return >> CreateUserResultPresenter

    object DddFamily {
      private val repository = UserRepositoryImpl()

      private val usecaseC = CreateUserUseCaseImpl(repository)
      private val usecaseReadAll = ListUserUseCaseImpl(repository)

      private val presenter = CreateUserResultPresenterImpl()
      private val presenter2 = ListUserResultPresenterImpl()

      val controller = UserController(usecaseC, usecaseReadAll, presenter, presenter2)

      def execute() = {
        val newUser = controller.create
        println(s"created user. id = ${newUser.id.value} name = ${newUser.name}")
        val list = controller.list
        list.foreach{
          u => println(s"listed user. id = ${u.id.value} name = ${u.name}")
        }
      }
    }

    DddFamily.execute()
  }

}
