package domainInterface.usecase.user

import util.dddSupport.usecase.{ PushPort, UseCase }

import scala.concurrent.Future
import scala.language.higherKinds

import domain.model.user.User

trait CreateUserUseCase
  extends UseCase with PushPort[String, Future[User]]
