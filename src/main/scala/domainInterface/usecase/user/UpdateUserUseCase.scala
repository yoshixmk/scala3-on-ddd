package domainInterface.usecase.user

import util.dddSupport.usecase.{ PushPort, UseCase }

import scala.language.higherKinds

import domain.model.user.{ User, UserId }

trait UpdateUserUseCase
  extends UseCase with PushPort[(UserId, String), Option[User]] {
    def call(arg: Input): Output
  }
