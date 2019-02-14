package part_1

object Slide_12_scalaz extends App {

  {
    import scalaz.Monoid
    import scalaz.std.anyVal.intInstance

    assert( Monoid[Int].append(32, 10) == 42 )
  }

  {
    import scalaz.Monoid
    import scalaz.std.string.stringInstance

    assert( Monoid[String].append("Hi ", "there") == "Hi there" )
  }

  {
    import scalaz.Semigroup
    import scalaz.std.string.stringInstance

    assert( Semigroup[String].append("Hi ", "there") == "Hi there" )
  }
}
