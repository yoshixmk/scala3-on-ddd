package adapter.output.presenter.user

import adapter.output.json.model.user.UserResponseConverter

import scala.concurrent.{ ExecutionContext, Future }

import domainInterface.adapter.output.DeleteUserResultPresenter

class DeleteUserResultPresenterImpl
  extends DeleteUserResultPresenter[Result]
    with UserResponseConverter with Results {

  override def response(arg: Future[Boolean])(implicit ec: ExecutionContext): Future[Result] = {
    arg.map(res => Ok(convertToJson(res)))
  }

}