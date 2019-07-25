package t0141;

/**
 * @author yuanweimin(aszed)
 * @title linked-list-cycle
 * @id #0141
 */

/*
 * https://leetcode-cn.com/problems/linked-list-cycle/
 *
 * 给定一个链表，判断链表中是否有环。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表
 * 中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
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

        ListNode rep = new ListNode(5);
        ListNode head = new ListNode(1);
        head.next = rep;
        head.next.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = rep;

        System.out.println(solution.hasCycle(head));
    }
}
