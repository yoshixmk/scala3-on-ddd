package usecase.user

import scala.language.higherKinds

import domain.model.user.UserId
import domainInterface.adapter.ioGateway.UserRepository
import domainInterface.usecase.user.DeleteUserUseCase

class DeleteUserUseCaseImpl (
  userRepository: UserRepository,
) extends DeleteUserUseCase {

  override def call(arg: UserId): Boolean = {
    val userId = arg
    // userRepository.deleteById(userId)
    return true
  }
}
