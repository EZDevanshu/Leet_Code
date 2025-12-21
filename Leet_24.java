
class Solution {

    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode i, j;
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            i = prev.next;
            j = i.next;

            i.next = j.next;
            j.next = i;
            prev.next = j;

            prev = i;

        }
        return head;
    }

}
