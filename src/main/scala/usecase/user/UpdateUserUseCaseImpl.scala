package usecase.user

import scala.concurrent.{ ExecutionContext, Future }
import scala.language.higherKinds

import domain.model.user.{ User, UserId }
import domainInterface.adapter.ioGateway.UserRepository
import domainInterface.usecase.user.UpdateUserUseCase

class UpdateUserUseCaseImpl[M[+ _]] (
  userRepository: UserRepository[M],
) extends UpdateUserUseCase {

  override def call(arg: (UserId, String))(implicit ec: ExecutionContext): Future[Option[User]] = {
    val (userId, name) = arg
      for {
        res <- Future(Option(User(UserId("1"), "foo")))
      } yield res
  }
}
