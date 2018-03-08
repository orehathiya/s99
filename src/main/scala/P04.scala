object P04 {
  var count = 1

  def length(ls: List[Int]): Int = {
    ls match {
      case Nil => 0
      case head :: Nil => count
      case head :: tail => {
        count += 1
        length(tail)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    println(length(List[Int](1, 3, 4)))
  }
}