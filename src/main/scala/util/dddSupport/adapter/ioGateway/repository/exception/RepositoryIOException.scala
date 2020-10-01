package util.dddSupport.adapter.ioGateway.repository.exception

/**
  * RepositoryのIO例外
  * @param message エラーメッセージ
  */
case class RepositoryIOException(message: String) extends Exception(message)
