package domain.model.user

import util.dddSupport.domain.{ IdGenerator, Identifier }

case class UserId(value: String) extends Identifier[String]

object UserId {
  def generate: UserId = UserId(IdGenerator.generate.value)
}

