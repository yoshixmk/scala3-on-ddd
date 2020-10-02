package usecase.user

import scala.concurrent.{ ExecutionContext, Future }
import scala.language.higherKinds

import domain.model.user.User
import domain.model.user.UserId
import domainInterface.adapter.ioGateway.UserRepository
import domainInterface.usecase.user.CreateUserUseCase

class CreateUserUseCaseImpl (
  userRepository: UserRepository,
  ) extends CreateUserUseCase {

  override def call(arg: String)(implicit ec: ExecutionContext): Future[User] = {
    val name = arg
      // user1 <- userRepository.store(User(name = name))
//      user2 <- userRepository.store(User(name = name))
    Future(User(UserId("1"), "foo"))
  }
}
