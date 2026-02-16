/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        HashMap<Node , Node> mp = new HashMap<>();

        Node cur = head;
        while(cur != null){
            mp.put(cur ,new Node(cur.val));
            cur = cur.next;            
        }

        cur = head;

        // mp.get(cur) = A'(copy Node)
        // mp.get(cur.next) = B'
        // connect A' with B'
        while(cur != null){
            mp.get(cur).next = mp.get(cur.next);
            mp.get(cur).random = mp.get(cur.random);
            cur = cur.next;
        }

        return mp.get(head);
    }
}

public class Leet_138 {
    public static void main(String[] args) {
        
    }
}
