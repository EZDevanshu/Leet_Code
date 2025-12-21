class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode current = head;

        while (current != null) {
            ListNode ptr = current.next;
            while (ptr != null) {
                if (current.val > ptr.val) {
                    // Swap values (like you did in C)
                    int temp = current.val;
                    current.val = ptr.val;
                    ptr.val = temp;
                }
                ptr = ptr.next;
            }
            current = current.next;
        }

        return head;
    }
}