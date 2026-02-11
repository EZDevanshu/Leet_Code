
class Solution {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // find middle point to make 2 half...
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half and make middle node null
        ListNode curr = slow.next;
        slow.next = null;

        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //prev is head of reverse list half 
        ListNode left = head;
        ListNode right = prev;

        while (right != null) {
            ListNode nextLeft = left.next;
            ListNode nextRight = right.next;

            left.next = right;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
    }
}

public class Leet_143 {

    public static void main(String[] args) {

    }
}
