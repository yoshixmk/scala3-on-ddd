package domain.model.user

import util.dddSupport.domain.{ Entity, IdGenerator }
case class User(
  id: UserId = UserId.generate,
  name: String | Name) extends Entity[UserId] {
  override val identifier: UserId = id
}
