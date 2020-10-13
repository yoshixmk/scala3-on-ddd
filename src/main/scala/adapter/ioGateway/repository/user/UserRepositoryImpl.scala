package adapter.ioGateway.repository.user

import domainInterface.adapter.ioGateway.UserRepository
import domain.model.user._

class UserRepositoryImpl extends UserRepository {

  import scala.collection.immutable.Seq
  // dummy store
  private var store = Seq[User]()

  def resolveById(id: UserId): Option[User] = this.store.find(_.id == id)

  def resolveAll: Seq[User] = this.store

  def update(entity: User): Option[User] = ???

  def store(entity: User): User = {
    this.store = this.store :+ entity
    entity
  }

  def deleteById(id: UserId): Boolean = ???
} 
