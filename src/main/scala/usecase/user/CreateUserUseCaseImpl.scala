package usecase.user

import scala.language.higherKinds

import domain.model.user.User
import domain.model.user.UserId
import domainInterface.adapter.ioGateway.UserRepository
import domainInterface.usecase.user.CreateUserUseCase

class CreateUserUseCaseImpl (
  userRepository: UserRepository,
  ) extends CreateUserUseCase {

  override def call(arg: String): User = {
    val name = arg
    this.userRepository.store(User(name = name))
  }
}
