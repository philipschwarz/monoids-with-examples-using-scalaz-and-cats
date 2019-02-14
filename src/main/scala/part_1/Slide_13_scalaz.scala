package part_1

object Slide_13_scalaz extends App {

  import scalaz.Monoid
  import scalaz.std.string.stringInstance
  import scalaz.std.anyVal.intInstance
  import scalaz.syntax.semigroup._

  assert( ( "Hi " |+| "there" |+| Monoid[String].zero ) == "Hi there" )

  assert( ( 1 |+| 2 |+| Monoid[Int].zero ) == 3 )


  assert( ( "Hi " ⊹ "there" ⊹ Monoid[String].zero ) == "Hi there" )

  assert( ( 1 ⊹ 2 ⊹ Monoid[Int].zero ) == 3 )


  assert( ( "Hi " mappend "there" mappend Monoid[String].zero ) == "Hi there" )

  assert( ( 1 mappend 2 mappend Monoid[Int].zero ) == 3 )

}
