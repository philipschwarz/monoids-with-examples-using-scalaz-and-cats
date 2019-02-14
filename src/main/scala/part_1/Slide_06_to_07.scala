package part_1

object Slide_06_to_07 {

  // Monoid instances for string concatenation, integer addition and integer multiplication, as well as the Boolean operators

  trait Monoid[A] {
    def op(a1: A, a2: A): A
    def zero: A
  }

  implicit val stringMonoid: Monoid[String] = new Monoid[String] {
    def op(a1: String, a2: String) = a1 + a2
    val zero = ""
  }

  implicit def listMonoid[A]: Monoid[List[A]] = new Monoid[List[A]] {
    def op(a1: List[A], a2: List[A]) = a1 ++ a2
    val zero = Nil
  }

  implicit val intAddition: Monoid[Int] = new Monoid[Int] {
    def op(x: Int, y: Int) = x + y
    val zero = 0
  }

  implicit val intMultiplication: Monoid[Int] = new Monoid[Int] {
    def op(x: Int, y: Int) = x * y
    val zero = 1
  }

  implicit val booleanOr: Monoid[Boolean] = new Monoid[Boolean] {
    def op(x: Boolean, y: Boolean) = x || y
    val zero = false
  }

  val booleanAnd: Monoid[Boolean] = new Monoid[Boolean] {
    def op(x: Boolean, y: Boolean) = x && y
    val zero = true
  }

}
