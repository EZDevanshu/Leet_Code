
import java.util.*;
import javax.naming.ldap.HasControls;

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public class Solution {

        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
    }
}

public class Leet_141 {

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        head.next.next.next.next = head.next;

        // ListNode.Solution obj = new ListNode.Solution();
        // boolean ans = obj.hasCycle(head);
        // System.out.println(ans);
    }
}
