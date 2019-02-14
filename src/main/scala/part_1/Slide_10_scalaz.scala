package part_1

object Slide_10_scalaz extends App {

  import scalaz.Monoid
  import scalaz.std.anyVal.intInstance
  import scalaz.std.list.listMonoid
  import scalaz.std.string.stringInstance
  import scalaz.syntax.semigroup._

  def f[A](a: A, b: A, c: A)(implicit m: Monoid[A]): (A,A,A) =
    ( a |+| b, a |+| c, b |+| c )

  assert( f("a","b","c") == ("ab","ac","bc"))
  assert( f(List(1,2), List(3,4), List(5,6)) == (List(1, 2, 3, 4),List(1, 2, 5, 6),List(3, 4, 5, 6)) )
  assert( f(1,2,3) == (3,4,5) )

}
