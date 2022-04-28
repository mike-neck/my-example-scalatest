package com.example

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should

class RuleSpec extends AnyFunSpec with should.Matchers {

  describe("Rule(5, 'Buzz')") {
    val rule = Rule(5, "Buzz")
    describe("When apply to Value(1)") {
      val value = rule(Value(1))
      it("should be Value(1)") {
        value shouldBe Value(1)
      }
    }
    describe("When apply to Value(5)") {
      val value = rule(Value(5))
      it("should be Value('Buzz',5)") {
        value shouldBe Value("Buzz", 5)
      }
    }
    describe("When apply to Value('Foo',5)") {
      val value = rule(Value("Foo", 5))
      it ("should be Value('FooBuzz',5)") {
        value shouldBe Value("FooBuzz", 5)
      }
    }
  }
}
