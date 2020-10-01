package util.dddSupport.adapter.ioGateway.repository

import util.dddSupport.domain.{ Entity, Identifier }

/**
  * リポジトリ責務を表すトレイト。
  *
  * @tparam ID 識別子の型
  * @tparam E エンティティの型
  */
trait Repository[ID <: Identifier[_], E <: Entity[ID]] {

  type This <: Repository[ID, E]
}
