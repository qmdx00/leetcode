import java.util.Stack;

/**
 * @author yuanweimin(aszed)
 * @title reverse-linked-list
 * @id #0206
 */

/*
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, next = null;
        ListNode cur = head;

        while(cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> s = new Stack<>();

        ListNode res = new ListNode(0);
        ListNode p = head;
        ListNode q = res;

        while(p != null) {
            s.push(p.val);
            p = p.next;
        }

        while(!s.isEmpty()) {
            q.next = new ListNode(s.pop());
            q = q.next;
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