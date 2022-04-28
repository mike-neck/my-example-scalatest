package com.example

import com.example
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should

class ValueSpec extends AnyFunSuite with should.Matchers {
  test("Value(1) is Value(None, 1)") {
    Value(1) should be(Value(None, 1))
  }
  test("Value(1)'s text is '1'") {
    val value = Value(1)
    value.text shouldBe "1"
  }

  test("Value('Foo', 20).text is 'Foo'") {
    val value = Value("Foo", 20)
    value.text shouldBe "Foo"
  }
}
