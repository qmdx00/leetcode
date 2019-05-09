package s0002

object Main extends App {
  val s1 = new ListNode(2)
  s1.next = new ListNode(4)
  s1.next.next = new ListNode(3)

  val s2 = new ListNode(5)
  s2.next = new ListNode(6)
  s2.next.next = new ListNode(4)

  println(Solution.addTwoNumbers(s1, s2))
}

class ListNode(var _x: Int = 0) {
  var next: ListNode = _
  var x: Int = _x
}

object Solution {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    null
  }
}