class Solution {
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dumy = new ListNode(0);
        dumy.next = head;
        ListNode prev = dumy;
        ListNode cur = head;

        int count = 0;
        while(cur!= null){
            cur = cur.next;
            count++;
        }

        while(count >= k){
            cur = prev.next;
            ListNode next = cur.next;

            for(int i = 1 ; i < k ; i++){
                cur.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = cur.next;
            }
            prev = cur;
            count -= k;
        }
        return dumy.next;
    }
}

public class Leet_25 {
    public static void main(String[] args) {

    }
}
