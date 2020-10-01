package util.dddSupport.domain

/**
  * Entityの識別子を表すトレイト
  *
  * @tparam A 識別子の値型
  */
trait Identifier[+A] {

  def value: A

  /**
    * 指定されたオブジェクトと等価であるかを判定する
    *
    * @param id ID
    * @return true 等価である場合
    *         false 等価でない場合
    */
  override def equals(id: Any) = id match {
    case that: Identifier[_] =>
      value == that.value
    case _ => false
  }

  /**
    * ハッシュコードを返す
    *
    * @return HashCode
    */
  override def hashCode = 31 * value.##
}