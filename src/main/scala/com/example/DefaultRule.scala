package com.example

case class DefaultRule(mod: Int, text: String) extends Rule {
  override def apply(value: Value): Value =
    if (value.original % mod == 0) {
      value.current match {
        case Some(v) => Value(s"$v$text", value.original)
        case None => Value(text, value.original)
      }
    } else value
}
