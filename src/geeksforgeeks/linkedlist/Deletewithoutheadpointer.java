package geeksforgeeks.linkedlist;

public class Deletewithoutheadpointer {
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
    public static void deleteNode(ListNode node)
    {
        // Your code here
        ListNode temp = node.next;
        node.val = temp.val;
        node.next = temp.next;
        temp = null;
    }
    public static void main(String[] args) {
    ListNode node=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4, new ListNode(5)))));
    deleteNode(node);
        System.out.println(node.toString());
    }
}
