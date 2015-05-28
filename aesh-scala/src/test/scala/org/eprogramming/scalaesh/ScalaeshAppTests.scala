package org.esmerilprogramming.scalaesh

import org.scalatest._

/**
* Test suite class.
* author helio frota
*/
class ScalaeshAppTests extends FunSuite {
    val firstTest = 1;
    test("1 == 1") {
        println("testing tests")
        assert (firstTest == 1)
    }
}
