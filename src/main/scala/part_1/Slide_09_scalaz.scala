package part_1

import scalaz.Semigroup

object Slide_09_scalaz extends App {

  import scalaz.std.anyVal.intInstance
  import scalaz.std.list.listMonoid
  import scalaz.std.string.stringInstance

  {
    def combine[A](a: A, b: A, c: A)(implicit sg: Semigroup[A]): (A,A,A) =
      ( sg.append(a,b), sg.append(a,c), sg.append(b,c) )

    assert( combine("a","b","c") == ("ab","ac","bc"))
    assert( combine( List(1,2), List(3,4), List(5,6) ) == ( List(1,2,3,4), List(1,2,5,6), List(3,4,5,6) ) )
    assert( combine(1,2,3) == (3,4,5) )
  }

  {
    import scalaz.syntax.semigroup._

    def combine[A](a: A, b: A, c: A)(implicit sg: Semigroup[A]): (A,A,A) =
      ( a |+| b, a |+| c, b |+| c )

    assert( combine("a","b","c") == ("ab","ac","bc"))
    assert( combine( List(1,2), List(3,4), List(5,6) ) == ( List(1,2,3,4), List(1,2,5,6), List(3,4,5,6) ) )
    assert( combine(1,2,3) == (3,4,5) )
  }

  {
    import scalaz.syntax.semigroup._

    def combine[A](a: A, b: A, c: A)(implicit sg: Semigroup[A]): (A,A,A) =
      ( a ⊹ b, a ⊹ c, b ⊹ c )

    assert( combine("a","b","c") == ("ab","ac","bc"))
    assert( combine( List(1,2), List(3,4), List(5,6) ) == ( List(1,2,3,4), List(1,2,5,6), List(3,4,5,6) ) )
    assert( combine(1,2,3) == (3,4,5) )
  }

  {
    import scalaz.syntax.semigroup._

    def combine[A](a: A, b: A, c: A)(implicit sg: Semigroup[A]): (A,A,A) =
      ( a mappend b, a mappend c, b mappend c )

    assert( combine("a","b","c") == ("ab","ac","bc"))
    assert( combine( List(1,2), List(3,4), List(5,6) ) == ( List(1,2,3,4), List(1,2,5,6), List(3,4,5,6) ) )
    assert( combine(1,2,3) == (3,4,5) )
  }

}
