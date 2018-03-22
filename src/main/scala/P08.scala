object P08 {
  def compress(ls: List[Symbol]): List[Symbol] = ls match {
    case Nil => Nil
    case head :: tail => head :: compress(tail.dropWhile(_ == head))
  }

  def main(args: Array[String]): Unit = {
    println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
