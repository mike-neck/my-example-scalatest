package com.example

case class Value(current: Option[String], original: Int) extends FizzBuzz {
  override def text: String = this match {
    case Value(Some(t), _) => t
    case Value(None, i) => i.toString
  }
}

object Value {
  def apply(original: Int): Value = Value(None, original)
  def apply(text: String, original: Int): Value = Value(Some(text), original)
}
