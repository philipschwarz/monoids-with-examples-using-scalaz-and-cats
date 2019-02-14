package part_1

object Slide_12_cats extends App {

  {
    import cats.Monoid
    import cats.instances.int._

    assert( Monoid[Int].combine(32, 10) == 42 )
  }

  {
    import cats.Monoid
    import cats.instances.string._

    assert( Monoid[String].combine("Hi ", "there") == "Hi there" )
  }

  {
    import cats.Semigroup
    import cats.instances.string._

    assert( Semigroup[String].combine("Hi ", "there") == "Hi there" )
  }
}
