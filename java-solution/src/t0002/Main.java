package t0002;

/**
 * @author yuanweimin(aszed)
 * @title add-two-numbers
 * @id #0002
 */

/*
 * https://leetcode-cn.com/problems/add-two-numbers/
 *
 * 给出两个非空的链表用来表示两个非负的整数。其中，它们各自的位数是
 * 按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p, q, cur;
        ListNode head = new ListNode(0);
        p = l1;
        q = l2;
        cur = head;
        int carry = 0;
        while (p != null  || q != null) {
            int x = (p == null) ? 0 : p.val;
            int y = (q == null) ? 0 : q.val;
            int sum = x + y + carry;
            ListNode temp = new ListNode(0);
            if (sum > 9) {
                temp.val = sum - 10;
                carry = 1;
            } else {
                temp.val = sum;
                carry = 0;
            }
            cur.next = temp;
            cur = temp;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) cur.next = new ListNode(carry);
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode s1 = new ListNode(2);
        s1.next = new ListNode(4);
        s1.next.next = new ListNode(3);

        ListNode s2 = new ListNode(5);
        s2.next = new ListNode(6);
        s2.next.next = new ListNode(4);

        ListNode res = solution.addTwoNumbers(s1, s2);
        traverseList(res);  // 342 + 465 = 807
    }

    static void traverseList(ListNode list) {
        ListNode head = list;
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }
        System.out.println();
    }
}
