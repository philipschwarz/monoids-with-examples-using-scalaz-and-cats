package part_1

object Slide_03 extends App {

  // integer addition monoid

  { // the operation is associative

    val (x,y,z) = (1,2,3)

    assert( ( ( x + y ) + z ) == ( x + ( y + z ) ) )

    assert( ( ( x + y ) + z ) == 6 )
  }

  { // zero is an identity element

    val s = 3

    assert( s == s + 0)

    assert( s == 0 + s)
  }

}
