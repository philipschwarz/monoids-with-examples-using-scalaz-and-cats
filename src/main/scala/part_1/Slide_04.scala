package part_1

object Slide_04 extends App {

  // integer multiplication monoid

  { // the operation is associative

    val (x,y,z) = (2,3,4)

    assert( ( ( x * y ) * z ) == ( x * ( y * z ) ) )

    assert( ( ( x * y ) * z ) == 24 )
  }

  { // one is an identity element

    val s = 3

    assert( s == s * 1)

    assert( s == 1 * s)
  }

}
