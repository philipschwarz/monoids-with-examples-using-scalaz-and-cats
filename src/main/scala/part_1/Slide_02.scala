package part_1

object Slide_02 extends App {

  // string concatenation monoid

  { // the empty string is an identity element

    val s = "foo" + "bar"

    assert(s == "foobar")

    assert(s == s + "")

    assert(s == "" + s)
  }

  { // the operation is associative

    val (r,s,t) = ("foo", "bar", "baz")

    assert( ( ( r + s ) + t ) == ( r + ( s + t ) ) )

    assert( ( ( r + s ) + t ) == "foobarbaz")
  }

}
