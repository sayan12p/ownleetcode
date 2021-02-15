package first;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithPointer {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode random;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        public String toString() {
            String result = val+ " ";
            if (random != null) {
                result += random.toString();
            }
            if (next != null) {
                result += next.toString();
            }
            return result;
        }
    }
    public static ListNode copyRandomList(ListNode head) {
        if (head == null) {
            return null;
        }

        Map<ListNode, ListNode> map = new HashMap<>();

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode newNode = null;

        while (head != null) {
            if (map.containsKey(head)) {
                newNode = map.get(head);
            } else {
                newNode = new ListNode(head.val);
                map.put(head, newNode);
            }

            if (head.random != null) {
                if (map.containsKey(head.random)) {
                    newNode.random = map.get(head.random);
                } else {
                    newNode.random = new ListNode(head.random.val);
                    map.put(head.random, newNode.random);
                }
            }

            current.next = newNode;
            current = newNode;
            head = head.next;
        }

        return dummy.next;
    }

    public static void main(String args[]){
        ListNode node1 = new ListNode(7,new ListNode(13,new ListNode(11,new ListNode(10,new ListNode(1,null)))));
        node1.random=null;
        node1.next.random=node1;
        node1.next.next.random=node1.next.next.next;
        node1.next.next.next.random=node1.next.next;
        node1.next.next.next.next.random=node1;

        //int x=3;
        ListNode resultnode=copyRandomList(node1);
        System.out.println(resultnode.toString());
    }

}
