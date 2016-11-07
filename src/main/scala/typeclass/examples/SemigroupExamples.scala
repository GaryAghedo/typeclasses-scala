package typeclass.examples

import typeclass.data.Last
import typeclass.syntax.Semigroup._
import typeclass.std.int._

object SemigroupExamples {
  println(1.combine(1))

  val last = Last(Some(5)).combine(Last(Some(2)))
  println(last)
}
