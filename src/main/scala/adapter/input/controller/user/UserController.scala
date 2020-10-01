package adapter.input.controller.user

import com.google.inject.Inject

import adapter.input.json.model.user.{ UserCreateRequest, UserDeleteRequest, UserUpdateRequest }

import scala.concurrent.Future

import domain.model.user.UserId
import domainInterface.adapter.output.{ CreateUserResultPresenter, DeleteUserResultPresenter, ListUserResultPresenter, UpdateUserResultPresenter }
import domainInterface.usecase.user.{ CreateUserUseCase, DeleteUserUseCase, ListUserUseCase, UpdateUserUseCase }

class UserController @Inject()(
  createUserUseCase: CreateUserUseCase,
  updateUserUseCase: UpdateUserUseCase,
  deleteUserUseCase: DeleteUserUseCase,
  listUserUseCase: ListUserUseCase,
  createUserResultPresenter: CreateUserResultPresenter[Result],
  updateUserResultPresenter: UpdateUserResultPresenter[Result],
  deleteUserResultPresenter: DeleteUserResultPresenter[Result],
  listUserResultPresenter: ListUserResultPresenter[Result]
) extends Controller {

  def create = Action.async { implicit req =>
    req.body.asJson.map(UserCreateRequest.fromJson) match {
      case Some(\/-(x)) =>
        val uc = createUserUseCase.execute(x.name)
        createUserResultPresenter.response(uc) recover {
          case e: Throwable => BadRequest(e.getMessage)
        }
      case Some(-\/(e)) =>
        Future.successful { BadRequest(s"""parse failed: [${e.map(_._1).mkString(",")}]""") }
      case _ =>
        Future.successful { BadRequest(s"""request param is not json""") }
    }
  }

  def update = Action.async { implicit req =>
    req.body.asJson.map(UserUpdateRequest.fromJson) match {
      case Some(\/-(x)) =>
        val args = (UserId(x.userId), x.name)
        val uc = updateUserUseCase.execute(args)
        updateUserResultPresenter.response(uc) recover {
          case e: Throwable => BadRequest(e.getMessage)
        }
      case Some(-\/(e)) =>
        Future.successful { BadRequest(s"""parse failed: [${e.map(_._1).mkString(",")}]""") }
      case _ =>
        Future.successful { BadRequest(s"""request param is not json""") }
    }
  }

  def delete = Action.async { implicit req =>
    req.body.asJson.map(UserDeleteRequest.fromJson) match {
      case Some(\/-(x)) =>
        val args = UserId(x.userId)
        val uc = deleteUserUseCase.execute(args)
        deleteUserResultPresenter.response(uc) recover {
          case e: Throwable => BadRequest(e.getMessage)
        }
      case Some(-\/(e)) =>
        Future.successful { BadRequest(s"""parse failed: [${e.map(_._1).mkString(",")}]""") }
      case _ =>
        Future.successful { BadRequest(s"""request param is not json""") }
    }
  }

  def list = Action.async { implicit req =>
    val res = listUserUseCase.execute(())
    listUserResultPresenter.response(res) recover {
      case e: Throwable => BadRequest(e.getMessage)
    }
  }

}
