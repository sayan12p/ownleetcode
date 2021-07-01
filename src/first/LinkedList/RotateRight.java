package first.LinkedList;

public class RotateRight {
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
    public static ListNode rotateRight(ListNode head, int k) {
        if (head==null)
            return null;
        ListNode dummyhead=new ListNode(0);
        dummyhead.next=head;
        ListNode temp1=head, temp2=head, temp3;
        int i=0;
        while (i<k){
            temp1=temp1.next;
            i++;
            if (temp1==null)
                temp1=head;
        }
        if (temp1==head)
            return temp1;
        while (temp1.next!=null){
            temp2=temp2.next;
            temp1=temp1.next;
        }
        temp3=temp2.next;
        temp2.next=null;
        temp1.next=head;
        return temp3;
    }
    public static void main(String args[]){
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));
        //ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        ListNode resultnode=rotateRight(node1,2);
        System.out.println(resultnode.toString());
    }
}
