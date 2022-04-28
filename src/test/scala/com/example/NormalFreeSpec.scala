package com.example

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should

class NormalFreeSpec extends AnyFreeSpec with should.Matchers {

  "An Int 3" - {
    val value = 3
    "when added by nothing" - {
      val actual = value + 0
      "it should be 3" in {
        actual shouldBe 3
      }
    }
    "when added by 1" - {
      val actual = value + 1
      "it should be 5" in {
        actual shouldBe 5
      }
    }
    "it should be 2" in {
      value shouldBe 2
    }
  }
}
