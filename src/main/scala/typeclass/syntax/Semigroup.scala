package typeclass.syntax

import typeclass.Semigroup

object Semigroup {
  implicit class SemigroupOps[A](a: A)(implicit A: Semigroup[A]){
    def combine(other: A): A = A.combine(a, other)
  }
}
