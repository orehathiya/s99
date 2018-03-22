object P07 {
  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ls: List[Any] => flatten(ls)
    case e => List(e)
  }

  def main(args: Array[String]): Unit = {
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }
}
