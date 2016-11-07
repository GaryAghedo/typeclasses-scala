package typeclass.std

import typeclass.{Monoid, Semigroup}


object option {
  implicit def optionSemigroup[A: Semigroup]: Semigroup[Option[A]] = new Semigroup[Option[A]] {
    override def combine(x: Option[A], y: Option[A]): Option[A] = (x, y) match {
      case (None, None) => None
      case (Some(x), None) => Some(x)
      case (None, Some(y)) => Some(y)
      case (Some(x), Some(y)) => Some(Semigroup[A].combine(x,y))
    }
  }

  implicit def optionMonoid[A: Semigroup]: Monoid[Option[A]] = new Monoid[Option[A]]{
    def empty: Option[A] = None
    def combine(x: Option[A], y: Option[A]): Option[A] = (x, y) match {
      case (None, None) => None
      case (Some(x), None) => Some(x)
      case (None, Some(y)) => Some(y)
      case (Some(x), Some(y)) => Some(Semigroup[A].combine(x,y))
    }
  }
}
