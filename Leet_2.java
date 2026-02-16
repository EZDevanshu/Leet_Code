// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode dummy = new ListNode();
//         ListNode res = dummy;
//         int total = 0, carry = 0;

//         while (l1 != null || l2 != null || carry != 0) {
//             total = carry;

//             if (l1 != null) {
//                 total += l1.val;
//                 l1 = l1.next;
//             }
//             if (l2 != null) {
//                 total += l2.val;
//                 l2 = l2.next;
//             }

//             int num = total % 10;
//             carry = total / 10;
//             dummy.next = new ListNode(num);
//             dummy = dummy.next;
//         }

//         return res.next;        
//     }
// }

// public class Leet_2 {
    
// }


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dmy = new ListNode(0);
        ListNode tail = dmy;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;

            int sum = v1 + v2 + carry;

            int digit = sum % 10;
            carry = sum / 10;

            tail.next = new ListNode(digit);
            tail = tail.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }    

        return dmy.next;    
    }
}
