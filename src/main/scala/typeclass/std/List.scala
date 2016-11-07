package typeclass.std

import typeclass.{Monoid, Semigroup}

object list {
  implicit def listSemigroup[T]: Semigroup[List[T]] = new Semigroup[List[T]]{
    def combine(a: List[T], b: List[T]): List[T] = a ++ b
  }

  implicit def listMonoid[T]: Monoid[List[T]] = new Monoid[List[T]] {
    override def combine(x: List[T], y: List[T]): List[T] = x ++ y
    override def empty: List[T] = List[T]()
  }

}
