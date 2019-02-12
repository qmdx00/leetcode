/**
 * @author yuanweimin(aszed)
 * @title add-two-numbers
 * @id #0002
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