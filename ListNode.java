
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

    class Solution {

        public ListNode reverseList(ListNode head) {

            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            return prev;
        }
    }
}

public class Leet_206 {

    public static void main(String[] args) {

    }
}
