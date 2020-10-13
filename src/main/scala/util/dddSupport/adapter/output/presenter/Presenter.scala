package util.dddSupport.adapter.output.presenter

trait Presenter[A, R] {

  type Arg = A
  type Rendered = R

  def response(arg: Arg): Rendered
}
