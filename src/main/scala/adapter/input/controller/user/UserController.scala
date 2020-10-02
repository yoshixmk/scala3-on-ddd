package adapter.input.controller.user

import scala.concurrent.Future

import domain.model.user.UserId
import domainInterface.adapter.output.{ CreateUserResultPresenter, DeleteUserResultPresenter, ListUserResultPresenter, UpdateUserResultPresenter }
import domainInterface.usecase.user.{ CreateUserUseCase, DeleteUserUseCase, ListUserUseCase, UpdateUserUseCase }

trait Controller

class UserController (
  createUserUseCase: CreateUserUseCase,
  // updateUserUseCase: UpdateUserUseCase,
  // deleteUserUseCase: DeleteUserUseCase,
  // listUserUseCase: ListUserUseCase,
  createUserResultPresenter: CreateUserResultPresenter[String],
  // updateUserResultPresenter: UpdateUserResultPresenter[Any],
  // deleteUserResultPresenter: DeleteUserResultPresenter[Any],
  // listUserResultPresenter: ListUserResultPresenter[Any]
) extends Controller {

  def create = "user created"

  def update = null

  def delete = ???

  def list = ???

}
