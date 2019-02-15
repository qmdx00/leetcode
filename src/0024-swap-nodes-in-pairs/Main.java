/**
 * @author yuanweimin(aszed)
 * @title swap-nodes-in-pairs
 * @id #0024
 */

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode res = new ListNode(-1);
        ListNode r = res;

        ListNode p, q, cur;
        cur = head;

        while (cur != null && cur.next != null) {
            p = cur;
            q = p.next;
            cur = q.next;

            q.next = p;
            p.next = null;
            r.next = q;

            r = r.next.next;
        }
        if (cur != null) {
            r.next = cur;
        }
        return res.next;
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

        ListNode head;
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        traverseList(solution.swapPairs(head));
    }

    static void traverseList(ListNode head) {
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }
}