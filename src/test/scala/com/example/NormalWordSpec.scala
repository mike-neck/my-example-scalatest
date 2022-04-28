package com.example

import org.scalatest.matchers.should
import org.scalatest.wordspec.AnyWordSpec

class NormalWordSpec extends AnyWordSpec with should.Matchers {

  "An Int 3" when {
    val value = 3
    "added by 2" should {
      val actual = value + 2
      "become 6" in {
        actual shouldBe 6
      }
    }
    "multiplied by 7" should {
      val actual = value * 7
      "become 21" in {
        actual shouldBe 21
      }
    }
  }
}
