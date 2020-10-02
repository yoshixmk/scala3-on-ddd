package usecase.user

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{ ExecutionContext, Future }
import scala.language.higherKinds

import domain.model.user.User
import domain.model.user.UserId
import domainInterface.adapter.ioGateway.UserRepository
import domainInterface.usecase.user.ListUserUseCase

class ListUserUseCaseImpl (
  userRepository: UserRepository,
) extends ListUserUseCase {

  override def call(arg: Unit)(implicit ec: ExecutionContext): Future[Seq[User]] = {
    Future(Seq(User(UserId("1"), "foo")))
  }
}
