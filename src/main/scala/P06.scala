import P05.reverse

object P06 {
  def isPalindrome(ls: List[Int]): Boolean = {
    ls == reverse(ls)
  }

  def main(args: Array[String]): Unit = {
    println(isPalindrome(List(1, 2, 3, 2, 1)))
  }
}
