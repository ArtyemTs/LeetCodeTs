package patterns.in_place_reversal_of_a_linked_list;

import patterns.ListNode;

public class ReverseLinkedList_206 {
    public ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode curr = head;
//
//        while (curr != null || curr.next != curr) {
//            ListNode nxt = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nxt;
//        }
//        return prev;
//    }

        // recursive =========
        return reversHead(head, null);
    }

    private ListNode reversHead(ListNode head, ListNode newHead) {
        if (head == null) {
            return newHead;
        }
        ListNode nxt = head.next;
        head.next = newHead;
        return reversHead(nxt, head);
    }
}
