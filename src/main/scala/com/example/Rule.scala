package com.example

trait Rule {
  def apply(value: Value): Value
}

object Rule {
  def apply(mod: Int, text: String): Rule = DefaultRule(mod, text)
}
