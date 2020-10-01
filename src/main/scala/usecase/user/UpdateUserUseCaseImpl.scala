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
        userOpt <- Option(User(1, "foo"))
        res <- {
          userOpt match {
            case Some(x) => userRepository.update(x.copy(name = name))
            case _ => none.point[M]
          }
        }
      } yield res
  }
}
