object P09 {
  def pack(ls: List[Symbol]): List[List[Serializable]] = ls match {
    case Nil => Nil
    case head :: tail => List(head :: tail.takeWhile(_ == head), pack(tail.dropWhile(_ == head)))
  }

  def main(args: Array[String]): Unit = {
    println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
