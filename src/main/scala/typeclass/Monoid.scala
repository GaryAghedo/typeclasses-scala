package typeclass


trait Monoid[T] extends Semigroup[T] {
  def empty: T
  def combine(x: T, y: T): T
}

object Monoid {
  def apply[A](implicit ev: Monoid[A]): Monoid[A] = ev
}
