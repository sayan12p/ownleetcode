package first.LinkedList;

import java.util.LinkedList;

public class ReverseListNormal {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        public String toString() {
            String result = val+ " ";
            if (next != null) {
                result += next.toString();
            }
            return result;
        }

    }
    public static ListNode reverse(ListNode node) {
        if (node==null) return null;
        ListNode previous =null;
        //ListNode current =previous.next;
        while(node!=null){
            ListNode next=node.next;
            node.next=previous;
            previous=node;
            node=next;

        }
return previous;
    }

    public static void main(String args[]) {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));
        /*ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));*/
        ListNode resultnode=reverse(node1);
        System.out.println(resultnode.toString());
    }
}
