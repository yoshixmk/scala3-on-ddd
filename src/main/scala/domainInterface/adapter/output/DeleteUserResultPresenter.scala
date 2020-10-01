package domainInterface.adapter.output

import util.dddSupport.adapter.output.presenter.Presenter

import scala.concurrent.Future

trait DeleteUserResultPresenter[R] extends Presenter[Future[Boolean], R]
