package part_1

import cats.Monoid

object Slide_13_cats extends App {

  import cats.Monoid
  import cats.instances.string._
  import cats.instances.int._
  import cats.syntax.semigroup._

  assert( ( "Hi " combine "there" combine Monoid[String].empty ) == "Hi there" )

  assert( ( 1 combine 2 combine Monoid[Int].empty ) == 3 )


  assert( ( "Hi " |+| "there" |+| Monoid[String].empty ) == "Hi there" )

  assert( ( 1 |+| 2 |+| Monoid[Int].empty ) == 3 )

}
