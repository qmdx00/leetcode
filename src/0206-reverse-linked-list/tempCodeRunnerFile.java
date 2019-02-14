public ListNode reverseList(ListNode head) {
        Stack s = new Stack<>();

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