public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = null, start = null;

        while (l1 != null && l2 != null) {
            if (start == null) {
                head = l1.val > l2.val ? l2 : l1;
                start = head;
            }
            else if(l1.val > l2.val) {
                head.next = l2;
                l2 = l2.next;
                head = head.next;
            }
            else {
                head.next = l1;
                l1 = l1.next;
                head = head.next;
            }
        }

        while (l1 != null && l2 != null) {
            if (head == null)
                head = l1.val > l2.val ? l2 : l1;
            if (l1.val > l2.val) {
                ListNode l2_next = l2.next;
                l2.next = l1;
                l2 = l2_next;
            } else {
                ListNode l1_next = l1.next;
                l1.next = l2;
                l1 = l1_next;
            }
        }
        return start;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}