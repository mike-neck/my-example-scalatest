package com.example

import org.scalatest._
import matchers.should
import org.scalatest.prop.{TableDrivenPropertyChecks, TableFor1}
import propspec.AnyPropSpec

import scala.collection.immutable.{BitSet, HashSet, TreeSet}

class NormalPropSpec extends AnyPropSpec with TableDrivenPropertyChecks with should.Matchers {

  val values: TableFor1[Int] = Table("int values", 1, 2, 3, 5, 7, 0, 11, 13)

  property("int multiplied by 0 should not be the same") {
    forAll(values) { item =>
      (item * 0) shouldNot be(item)
    }
  }
}

class SetImplPropSpec extends AnyPropSpec with TableDrivenPropertyChecks with should.Matchers {
  val sets: TableFor1[Set[Int]] = Table[Set[Int]](
    "set",
    BitSet.empty,
    HashSet.empty[Int],
    TreeSet.empty[Int]
  )

  property("an empty Set should have size 0") {
    forAll(sets) { set =>
      set.size should be (0)
    }
  }

  property("invoking head on an empty set should produce NoSuchElementException") {
    forAll(sets) { set =>
       a [NoSuchElementException] should be thrownBy { set.head }
    }
  }
}
