package domainInterface.adapter.output

import util.dddSupport.adapter.output.presenter.Presenter

import scala.concurrent.Future

import domain.model.user.User

trait UpdateUserResultPresenter[R] extends Presenter[Future[Option[User]], R]
