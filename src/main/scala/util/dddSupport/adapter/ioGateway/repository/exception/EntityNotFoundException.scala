package util.dddSupport.adapter.ioGateway.repository.exception

import util.dddSupport.domain.Identifier

/**
  * 存在しない識別子にアクセスした際の例外
  *
  * @param message エラーメッセージ
  */
case class EntityNotFoundException(message: String) extends Exception(message)

object EntityNotFoundException {

  def apply(identifier: Identifier[Any]): EntityNotFoundException = EntityNotFoundException(identifier.value.toString)

}
