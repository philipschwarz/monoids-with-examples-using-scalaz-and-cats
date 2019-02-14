package part_1

import cats.Semigroup

object Slide_09_cats extends App {

  import cats.instances.int._
  import cats.instances.list._
  import cats.instances.string._

  {
    def combine[A](a: A, b: A, c: A)(implicit sg: Semigroup[A]): (A,A,A) =
      ( sg.combine(a,b), sg.combine(a,c), sg.combine(b,c) )

    assert( combine("a","b","c") == ("ab","ac","bc"))
    assert( combine( List(1,2), List(3,4), List(5,6) ) == ( List(1,2,3,4), List(1,2,5,6), List(3,4,5,6) ) )
    assert( combine(1,2,3) == (3,4,5) )
  }

  {
    import cats.syntax.semigroup._

    def combine[A](a: A, b: A, c: A)(implicit sg: Semigroup[A]): (A,A,A) =
      ( a |+| b, a |+| c, b |+| c )

    assert( combine("a","b","c") == ("ab","ac","bc"))
    assert( combine( List(1,2), List(3,4), List(5,6) ) == ( List(1,2,3,4), List(1,2,5,6), List(3,4,5,6) ) )
    assert( combine(1,2,3) == (3,4,5) )
  }

  {
    import cats.syntax.semigroup._

    def combine[A](a: A, b: A, c: A)(implicit sg: Semigroup[A]): (A,A,A) =
      ( a combine b, a combine c, b combine c )

    assert( combine("a","b","c") == ("ab","ac","bc"))
    assert( combine( List(1,2), List(3,4), List(5,6) ) == ( List(1,2,3,4), List(1,2,5,6), List(3,4,5,6) ) )
    assert( combine(1,2,3) == (3,4,5) )
  }

}
