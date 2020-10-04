package domainInterface.usecase.user

import util.dddSupport.usecase.{ PushPort, UseCase }

import scala.language.higherKinds

import domain.model.user.User

trait ListUserUseCase
  extends UseCase with PushPort[Unit, Seq[User]]
