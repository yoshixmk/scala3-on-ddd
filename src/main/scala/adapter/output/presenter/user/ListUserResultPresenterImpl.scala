package adapter.output.presenter.user

import domain.model.user.User
import domainInterface.adapter.output.ListUserResultPresenter

class ListUserResultPresenterImpl
  extends ListUserResultPresenter[String] {
  def response(arg: Seq[String]): String = "example"
}
