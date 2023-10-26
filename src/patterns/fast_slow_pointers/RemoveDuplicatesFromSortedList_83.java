package patterns.fast_slow_pointers;

import patterns.ListNode;

public class RemoveDuplicatesFromSortedList_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;

        // recursive ===
        // if (head == null || head.next == null) {
        //     return head;
        // }
        // head.next = deleteDuplicates(head.next);
        // return head.next.val == head.val ? head.next : head;
    }
}
