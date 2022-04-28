package com.example

import org.scalatest.Tag
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should

class NormalFunSuite extends AnyFunSuite with should.Matchers {

  test("1 is 2") {
    1 shouldBe 2
  }

  test("2 is 4", Tag("foo")) {
    2 shouldBe 4
  }
}
