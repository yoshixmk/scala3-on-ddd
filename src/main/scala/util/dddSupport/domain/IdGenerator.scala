package util.dddSupport.domain

class UUID(value: String)

/**
  * ID生成器
  */
object IdGenerator {

  def generate: UUID = UUID("foo")

}