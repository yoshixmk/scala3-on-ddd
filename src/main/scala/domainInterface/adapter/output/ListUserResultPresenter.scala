package domainInterface.adapter.output

import util.dddSupport.adapter.output.presenter.Presenter

import scala.concurrent.Future

import domain.model.user.User

trait ListUserResultPresenter[R] extends Presenter[Future[Seq[User]], R]
