package usecase.user

import scala.language.higherKinds

import domain.model.user.User
import domain.model.user.UserId
import domainInterface.adapter.ioGateway.UserRepository
import domainInterface.usecase.user.ListUserUseCase

class ListUserUseCaseImpl (
  userRepository: UserRepository,
) extends ListUserUseCase {

  override def call(arg: Unit): Seq[User] = {
    Seq(User(UserId("1"), "foo"))
  }
}
