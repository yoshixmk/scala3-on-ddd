package domainInterface.usecase.user

import util.dddSupport.usecase.{ PushPort, UseCase }

import scala.language.higherKinds

import domain.model.user.User

trait CreateUserUseCase
  extends UseCase with PushPort[String, User] {
    def call(arg: Input): Output
  }
