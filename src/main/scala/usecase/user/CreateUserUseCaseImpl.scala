package usecase.user

import scala.concurrent.{ ExecutionContext, Future }
import scala.language.higherKinds

import domain.model.user.User
import domainInterface.adapter.ioGateway.UserRepository
import domainInterface.usecase.user.CreateUserUseCase

class CreateUserUseCaseImpl[M[+_]] (
  userRepository: UserRepository[M],
  ) extends CreateUserUseCase {

  override def call(arg: String)(implicit ec: ExecutionContext): Future[User] = {
    val name = arg
  for {
      user1 <- userRepository.store(User(name = name))
//      user2 <- userRepository.store(User(name = name))
    } yield user1
  }
}
