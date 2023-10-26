package patterns.fast_slow_pointers;

import patterns.ListNode;

public class RemoveLinkedListElements_203 {
    public ListNode removeElements(ListNode head, int val) {
        // //recursion =========

        // if (head == null) {
        //     return null;
        // }
        // head.next = removeElements(head.next, val);
        // return head.val == val ? head.next : head;

        //Fake first Node==========

        ListNode res = new ListNode();
        res.next = head;
        ListNode curr = res;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return res.next;
    }
}
