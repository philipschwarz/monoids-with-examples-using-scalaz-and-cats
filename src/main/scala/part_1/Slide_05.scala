package part_1

object Slide_05 extends App {

  // Boolean operator monoids

  { // the operations are associative

    val (p,q,r) = (true,false,true)

    assert( ( ( p || q ) || r ) == ( p || ( q || r ) ) )

    assert( ( ( p || q ) || r ) == true )

    assert( ( ( p && q ) && r ) == ( p && ( q && r ) ) )

    assert( ( ( p && q ) && r ) == false )
  }

  { // they have identity elements true and false, respectively

    val s = true

    assert( s == ( s && true ) )

    assert( s == ( true && s ) )

    assert( s == ( s || false ) )

    assert( s == ( false || s ) )
  }

}
