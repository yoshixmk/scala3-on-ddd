package domainInterface.usecase.user

import util.dddSupport.usecase.{ PushPort, UseCase }

import domain.model.user.UserId

trait DeleteUserUseCase
  extends UseCase with PushPort[UserId, Boolean] {
    def call(arg: Input): Output
  }
