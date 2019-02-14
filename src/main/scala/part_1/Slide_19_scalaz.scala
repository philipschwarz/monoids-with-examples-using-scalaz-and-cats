package part_1

import scalaz.{NonEmptyList, Semigroup}

object Slide_19_scalaz extends App {

  {
    def foo[A](x: A, y: A)(implicit sg: Semigroup[A]) =
      sg.append(x, y)

    assert( foo( NonEmptyList(1,2,3), NonEmptyList(4,5,6)) == NonEmptyList(1,2,3,4,5,6))
  }

  {
    import scalaz.syntax.semigroup._

    def foo[A](x: A, y: A)(implicit sg: Semigroup[A]) =
      x |+| y

    assert( foo( NonEmptyList(1,2,3), NonEmptyList(4,5,6)) == NonEmptyList(1,2,3,4,5,6))
  }

  {
    import scalaz.syntax.semigroup._

    def foo[A](x: A, y: A)(implicit sg: Semigroup[A]) =
      x ⊹ y

    assert( foo( NonEmptyList(1,2,3), NonEmptyList(4,5,6)) == NonEmptyList(1,2,3,4,5,6))
  }

  {
    import scalaz.syntax.semigroup._

    def foo[A](x: A, y: A)(implicit sg: Semigroup[A]) =
      x mappend y

    assert( foo( NonEmptyList(1,2,3), NonEmptyList(4,5,6)) == NonEmptyList(1,2,3,4,5,6))
  }

}
