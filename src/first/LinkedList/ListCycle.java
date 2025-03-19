package first.LinkedList;

public class ListCycle {
    public static class ListNode {
        int val;
        ListNode next;
        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        public static String toString(ListNode head) {
            String result = "";
            ListNode current = head;
            while(current != null){
                result += current.getVal();
                if(current.getNext() != null){
                    result += " ";
                }
                current = current.getNext();
            }
            return result;
        }
    }
    public static ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        slow = slow.next;
        fast = fast.next.next;

        while(fast != null && fast.next != null){
            // since we are at meeting point
            if(slow == fast){
                break;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        if(slow != fast){
            return null; // did not meet
        }

        // now get to the meeting point
        slow = head;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
    public static void main(String args[]){
        ListNode node1 = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4,null))));
        /*ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));*/

        ListNode resultnode=detectCycle(node1);
        System.out.println(ListNode.toString(resultnode));
    }
}
