object P05 {
  def reverse(ls: List[Int]): List[Int] = ls match {
    case Nil => List[Int]()
    case head :: tail => reverse(tail) :+ head
  }

  def main(args: Array[String]): Unit = {
    println(reverse(List(1, 1, 2, 3, 5, 8)))
  }
}
