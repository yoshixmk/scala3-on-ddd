package domainInterface.adapter.ioGateway

import util.dddSupport.adapter.ioGateway.repository.Repository

import scala.language.higherKinds

import domain.model.user.{ User, UserId }

trait UserRepository extends Repository[UserId, User] {

  def resolveById(id: UserId): Option[User]

  def resolveAll: Seq[User]

  def update(entity: User): Option[User]

  def store(entity: User): User

  def deleteById(id: UserId): Boolean
}

class UserRepositoryImpl extends UserRepository {

  import scala.collection.immutable.Seq
  // dummy store
  private val store = Seq[User]()

  def resolveById(id: UserId): Option[User] = ???

  def resolveAll: Seq[User] = ???

  def update(entity: User): Option[User] = ???

  def store(entity: User): User = {
    this.store :+ entity
    entity
  }

  def deleteById(id: UserId): Boolean = ???
} 
