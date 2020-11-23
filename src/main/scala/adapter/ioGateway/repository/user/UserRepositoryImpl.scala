package adapter.ioGateway.repository.user

import domainInterface.adapter.ioGateway.UserRepository
import domain.model.user._

class UserRepositoryImpl extends UserRepository {

  import scala.collection.mutable.Seq
  // dummy store
  private var store = Seq[User]()

  def resolveById(id: UserId): Option[User] = this.store.find(_.id == id)

  def resolveAll: Seq[User] = this.store

  def update(entity: User): Option[User] = {
    val i = this.store.map(_.id).indexOf(entity.id)
    this.store.update(i, entity)
    return if (i >= 0) Some(entity) else None
  }

  def store(entity: User): User = {
    this.store = this.store :+ entity
    entity
  }

  def deleteById(id: UserId): Boolean = {
    val ret = this.store.exists(_.id == id)
    if (ret) {
      this.store = this.store.filter(_.id == id)
    }
    return ret
  }
} 
