package domainInterface.adapter.output

import util.dddSupport.adapter.output.presenter.Presenter

import domain.model.user.User

trait CreateUserResultPresenter[R] {
  def response(arg: User): R
}
