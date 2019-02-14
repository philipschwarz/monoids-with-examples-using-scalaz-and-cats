package part_1

object Slide_11_cats extends App {

  import cats.instances.int._
  import cats.syntax.semigroup._

  val (a,b,c) = (2,3,4)

  assert( ((a |+| b) |+| c) == (a |+| (b |+| c)) )

  assert( ((1 |+| 2) |+| 3) == (1 |+| (2 |+| 3)) )

}
