package usecase.user

import scala.concurrent.{ ExecutionContext, Future }
import scala.language.higherKinds

import domain.model.user.UserId
import domainInterface.adapter.ioGateway.UserRepository
import domainInterface.usecase.user.DeleteUserUseCase

class DeleteUserUseCaseImpl[M[+ _]] (
  userRepository: UserRepository[M],
) extends DeleteUserUseCase {

  override def call(arg: UserId)(implicit ec: ExecutionContext): Future[Boolean] = {
    val userId = arg
    // userRepository.deleteById(userId)
    return Future(true)
  }
}
