package adapter.input.controller.user

import scala.concurrent.Future

import domain.model.user.UserId
import domainInterface.adapter.output.{ CreateUserResultPresenter, DeleteUserResultPresenter, ListUserResultPresenter, UpdateUserResultPresenter }
import domainInterface.usecase.user.{ CreateUserUseCase, DeleteUserUseCase, ListUserUseCase, UpdateUserUseCase }

trait Controller

class UserController (
  createUserUseCase: CreateUserUseCase,
  updateUserUseCase: UpdateUserUseCase,
  deleteUserUseCase: DeleteUserUseCase,
  listUserUseCase: ListUserUseCase,
  createUserResultPresenter: CreateUserResultPresenter[Any],
  updateUserResultPresenter: UpdateUserResultPresenter[Any],
  deleteUserResultPresenter: DeleteUserResultPresenter[Any],
  listUserResultPresenter: ListUserResultPresenter[Any]
) extends Controller {

  def create = null

  def update = null

  def delete = ???

  def list = ???

}
