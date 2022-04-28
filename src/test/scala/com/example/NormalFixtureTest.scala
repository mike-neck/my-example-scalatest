package com.example

import org.scalatest.{BeforeAndAfter, BeforeAndAfterEach}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class NormalFixtureTest extends AnyFlatSpec with BeforeAndAfter with should.Matchers {
  before {
    Seq.empty.head
  }

  "First test" should "be simple" in {
    "test" shouldBe "test"
  }
  "2nd test" should "be simple" in {
    "test" shouldBe "test"
  }
}

class NormalEachFixtureTest extends AnyFlatSpec with BeforeAndAfterEach with should.Matchers {
  override def beforeEach(): Unit = {
    super.beforeEach()
    Seq.empty.head
  }

  "foo" should "be bar" in {
    "foo" shouldBe "bar"
  }
}
