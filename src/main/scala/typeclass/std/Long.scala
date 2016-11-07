package typeclass.std

import typeclass.{Monoid, Semigroup}


object long {
  implicit val longSemigroup: Semigroup[Long] = new Semigroup[Long] {
    override def combine(x: Long, y: Long): Long = x + y
  }

  implicit val longMonoid: Monoid[Long] = new Monoid[Long] {
    override def combine(x: Long, y: Long): Long = x + y
    override def empty: Long = 0
  }
}
