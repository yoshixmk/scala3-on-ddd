package domainInterface.usecase.user

import util.dddSupport.usecase.{ PushPort, UseCase }

import scala.concurrent.Future

import domain.model.user.UserId

trait DeleteUserUseCase
  extends UseCase with PushPort[UserId, Future[Boolean]]
