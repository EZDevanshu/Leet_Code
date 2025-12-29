//     class Solution {
//         public ListNode rotateRight(ListNode head, int k) {


//             if(head == null || head.next == null || k == 0 ){
//                 return head;
//             }

//             ListNode tail = head;
//             int len = 1;

//             while(tail.next != null){
//                 tail = tail.next;
//                 len++;
//             }

//             tail.next = head;
//             k = k % len;

//             int newTail = len - k;
//             ListNode NewTail = head;

//             for(int i = 1 ; i < newTail ; i++){
//                 NewTail = NewTail.next;
//             }
//             ListNode NewHead = NewTail.next;
//             NewTail.next = null;

//             return NewHead;
//         }
//     }

// class Leet_61{
//     public static void main(String[] args) {
        
//     }
// }