package domainInterface.adapter.output

import util.dddSupport.adapter.output.presenter.Presenter

import scala.concurrent.Future

import domain.model.user.User

trait CreateUserResultPresenter[R] extends Presenter[Future[User], R]
