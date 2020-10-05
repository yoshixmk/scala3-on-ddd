package util.dddSupport.domain

case class UUID(value: String)

/**
  * ID生成器
  */
object IdGenerator {

  def generate: UUID = UUID(uuid)
  
  private def uuid = java.util.UUID.randomUUID.toString

}