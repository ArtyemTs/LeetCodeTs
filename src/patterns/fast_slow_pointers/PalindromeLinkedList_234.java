package patterns.fast_slow_pointers;

import patterns.ListNode;

public class PalindromeLinkedList_234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode mid = getMid(head);
        ListNode revers = getRev(mid);

        while (revers != null) {
            if (head.val != revers.val) {
                return false;
            }
            head = head.next;
            revers = revers.next;
        }
        return true;
    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode getRev(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
