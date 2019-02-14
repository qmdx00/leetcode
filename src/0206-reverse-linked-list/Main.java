import java.util.Stack;

/**
 * @author yuanweimin(aszed)
 * @title reverse-linked-list
 * @id #0206
 */

/**
 *      ListNode res = null;
        ListNode next = null;
        ListNode p = head;
        while(p != null) {
            next = p.next;
            p.next = res;
            res = p;
            p = next;
        }
        return res;
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode res = null;
        ListNode next = null;
        ListNode p = head;
        while(p != null) {
            next = p.next;
            p.next = res;
            res = p;
            p = next;
        }
        return res;
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

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        traverseList(solution.reverseList(head));
    }

    static void traverseList(ListNode head) {
        ListNode p = head;
        while(p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }
}