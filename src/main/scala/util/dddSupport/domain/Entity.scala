package util.dddSupport.domain

/**
  * エンティティの責務を表すトレイト
  *
  * @tparam ID 識別子
  */
trait Entity[ID <: Identifier[_]] {

  val identifier: ID

  /**
    * 指定されたオブジェクトと等価であるかを判定する
    *
    * @param entity エンティティ
    * @return true 等価である場合
    *         false 等価でない場合
    */
  override final def equals(entity: Any): Boolean =
  entity match {
    case that: Entity[_] => identifier.equals(that.identifier)
    case _ => false
  }

  /**
    * ハッシュコードを返す
    *
    * @return HashCode
    */
  override final def hashCode: Int = identifier.hashCode
}
