package com.example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class NormalFlatSpec extends AnyFlatSpec with should.Matchers {

  "1" should "be 2" in {
    1 shouldBe 2
  }

  it should "not throw anything" in {
    Set.empty.head
  }
}
