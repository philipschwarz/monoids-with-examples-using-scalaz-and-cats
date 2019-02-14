package part_1

object Slide_11_scalaz extends App {

  import scalaz.std.anyVal.intInstance
  import scalaz.syntax.semigroup._

  val (a,b,c) = (2,3,4)

  assert( ((a |+| b) |+| c) == (a |+| (b |+| c)) )

  assert( ((1 |+| 2) |+| 3) == (1 |+| (2 |+| 3)) )

}
