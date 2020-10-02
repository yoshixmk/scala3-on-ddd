package adapter.output.presenter.user

import domain.model.user.User
import domainInterface.adapter.output.{ CreateUserResultPresenter }

class CreateUserResultPresenterImpl
  extends CreateUserResultPresenter[String] {
    def response(arg: User): String = "example"
}
