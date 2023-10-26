package patterns.two_pointers;

import patterns.ListNode;

public class MergeTwoSortedLists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode head = res;

        while (true) {
            if (list1 == null) {
                head.next = list2;
                return res.next;
            } else if (list2 == null) {
                head.next = list1;
                return res.next;
            }

            if (list1.val < list2.val) {
                head.next = list1;
                head = head.next;
                list1 = list1.next;
            } else {
                head.next = list2;
                head = head.next;
                list2 = list2.next;
            }
        }
    }

    //recursive 1
    // if(l1 == null) return l2;
    // if(l2 == null) return l1;
    // if(l1.val < l2.val){
    // 	l1.next = mergeTwoLists(l1.next, l2);
    // 	return l1;
    // } else{
    // 	l2.next = mergeTwoLists(l1, l2.next);
    // 	return l2;
    // }
    // //recursive 2
    // if( l1==null || l2==null ) return l2==null ? l1 : l2;
    // ListNode first = (l2.val<l1.val) ? l2 : l1;
    // first.next=mergeTwoLists( first.next, first==l1 ? l2 : l1 );
    // return first;
}

