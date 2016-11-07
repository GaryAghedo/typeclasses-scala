package typeclass.data

import typeclass.Semigroup

import scalaprops.Gen

case class Last[A](value: Option[A])
object Last {
  implicit  def gen[A: Gen]: Gen[Last[A]] = Gen[Option[A]].map(Last(_))

  implicit def lastSemigroup[A] = new Semigroup[Last[A]] {
    def combine(x: Last[A], y: Last[A]): Last[A] = {
      x.value.fold(y)(_ => y)
    }
  }

}
