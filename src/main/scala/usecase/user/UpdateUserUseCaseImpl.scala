package usecase.user

import scala.language.higherKinds

import domain.model.user.{ User, UserId }
import domainInterface.adapter.ioGateway.UserRepository
import domainInterface.usecase.user.UpdateUserUseCase

class UpdateUserUseCaseImpl (
  userRepository: UserRepository,
) extends UpdateUserUseCase {

  override def call(arg: (UserId, String)): Option[User] = {
    val (userId, name) = arg
      for {
        res <- Option(User(UserId("1"), "foo"))
      } yield res
  }
}
