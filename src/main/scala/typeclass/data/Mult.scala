package typeclass.data

import typeclass.Semigroup

case class Mult(value: Int)

 object Mult {
   implicit val multSemigroup: Semigroup[Mult] = new Semigroup[Mult] {
     def combine(x: Mult, y: Mult): Mult = Mult(x.value * y.value)
   }
 }
