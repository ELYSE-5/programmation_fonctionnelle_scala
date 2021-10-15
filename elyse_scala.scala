sealed abstract class Vehicule[A]{}
case class Car(t: T) extends Vehicule[T]{}
case class Motorbike(t: T) extends Vehicule[T]{}
case class Boat(t: T) extends Vehicule[T]{}