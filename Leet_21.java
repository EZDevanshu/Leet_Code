
class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dmy = new ListNode(-1);
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode join = dmy;

        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                join.next = temp1;
                temp1 = temp1.next;
            } else {
                join.next = temp2;
                temp2 = temp2.next;
            }
            join = join.next;
        }
        while (temp1 != null) {
            join.next = temp1;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            join.next = temp2;
            temp2 = temp2.next;
        }

        return dmy.next;
    }
}

public class Leet_21 {

    public static void main(String[] args) {

    }
}
