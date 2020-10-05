package adapter.input.controller.user

import domain.model.user.UserId
import domain.model.user.User
import domainInterface.adapter.output.{ CreateUserResultPresenter, DeleteUserResultPresenter, ListUserResultPresenter, UpdateUserResultPresenter }
import domainInterface.usecase.user.{ CreateUserUseCase, DeleteUserUseCase, ListUserUseCase, UpdateUserUseCase }

trait Controller[T] {
  def create: T

  def update: T

  def delete: T

  def list: Seq[T]
}

class UserController (
  createUserUseCase: CreateUserUseCase,
  // updateUserUseCase: UpdateUserUseCase,
  // deleteUserUseCase: DeleteUserUseCase,
  // listUserUseCase: ListUserUseCase,
  createUserResultPresenter: CreateUserResultPresenter[String],
  // updateUserResultPresenter: UpdateUserResultPresenter[Any],
  // deleteUserResultPresenter: DeleteUserResultPresenter[Any],
  // listUserResultPresenter: ListUserResultPresenter[Any]
) extends Controller[User] {

  def create: User = createUserUseCase.call("username")

  // defread: User

  def update: User = ???

  def delete: User = ???

  def list: Seq[User] = ???

}
