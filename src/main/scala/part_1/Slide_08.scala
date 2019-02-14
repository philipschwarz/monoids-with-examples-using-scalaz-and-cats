package part_1

object Slide_08 extends App {

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

  def combine[A](a: A, b: A, c: A)(implicit m: Monoid[A]):
    (A,A,A) =  ( m.op(a,b), m.op(a,c), m.op(b,c) )

  assert( combine("a","b","c") == ("ab","ac","bc"))
  assert( combine( List(1,2), List(3,4), List(5,6) ) == (List(1,2,3,4), List(1,2,5,6), List(3,4,5,6)) )
  assert( combine(1,2,3) == (3,4,5) )

}
