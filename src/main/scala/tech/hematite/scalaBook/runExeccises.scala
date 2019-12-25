package tech.hematite.scalaBook

import tech.hematite.scalaBook.CheckSumAccumulator
import tech.hematite.scalaBook.Chapter5._

object RunExcercises extends App {

    // Chapter 4
    // start running excercises 
    val test_1: String = "hello world"
    val test_2: String = "this is a second test"

    val cs1 = CheckSumAccumulator.calculate(test_1)
    val cs2 = CheckSumAccumulator.calculate(test_2)
    val cs3 = CheckSumAccumulator.calculate(test_1)

    assert(cs1 == cs3)
    assert(cs1 != cs2)
    println("Chapter 4 complete!")

    // Chapter 5
   runChapter5()
   println("Chapter 5 complete")
}