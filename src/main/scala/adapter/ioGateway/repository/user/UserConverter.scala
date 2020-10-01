package adapter.ioGateway.repository.user

import domain.model.user.{ User, UserId }

case class UserDataModel(id: Int, name: String)

trait UserConverter {

  def convertToDomainModel(dataModel: UserDataModel): User = {
    User(
      id = UserId(dataModel.id),
      name = dataModel.name)
  }

  def convertToDataModel(domainModel: User): UserDataModel = {
    UserDataModel(
      id = domainModel.id.value,
      name = domainModel.name
    )
  }

}
