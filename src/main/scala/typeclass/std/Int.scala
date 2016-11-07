package typeclass.std

import typeclass.{Monoid, Semigroup}
object  int {
  implicit val intSemigroup: Semigroup[Int] = new Semigroup[Int] {
    override def combine(x: Int, y: Int): Int = x + y
  }

  implicit val intMonoid: Monoid[Int] = new Monoid[Int] {
    def combine(x: Int, y: Int): Int = x + y
    def empty: Int = 0
  }
}
