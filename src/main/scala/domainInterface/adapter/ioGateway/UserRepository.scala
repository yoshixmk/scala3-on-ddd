package domainInterface.adapter.ioGateway

import util.dddSupport.adapter.ioGateway.repository.Repository

import scala.language.higherKinds

import domain.model.user.{ User, UserId }

trait UserRepository[M[+_]] extends Repository[UserId, User] {

  def resolveById(id: UserId): M[Option[User]]

  def resolveAll: M[Seq[User]]

  def update(entity: User): M[Option[User]]

  def store(entity: User): M[User]

  def deleteById(id: UserId): M[Boolean]
}
