package com.example

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should

class NormalFunSpec extends AnyFunSpec with should.Matchers {

  describe("An Int 1") {
    val one = 1
    describe("when added by 1") {
      val actual = one + 1
      it("becomes 3") {
        actual shouldBe 3
      }
    }
    describe("when multiplied by 2") {
      val actual = one * 2
      it("becomes 4") {
        actual shouldBe 4
      }
    }
  }
}
