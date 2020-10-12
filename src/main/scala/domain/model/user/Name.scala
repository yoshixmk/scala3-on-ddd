package domain.model.user

case class Name(
  first : String,
  middle: String = "",
  last: String) {
  def initial = s"${first.take(0)}.${last.take(0)}"
  def fullName = s"$first $middle $last"
}
