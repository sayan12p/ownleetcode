package first.LinkedList;

public class RemoveDuplicatesfromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp=new ListNode(0);
        ListNode ptr=temp;
        temp.next=head;
        ListNode current=head;
        boolean dup=false;
        while (current.next!=null) {
            if (current.val == current.next.val) {
                current.next=current.next.next;
                dup = true;
            } else {
                if (dup) {
                    ptr.next = current.next;
                    current = current.next;
                } else {
                    ptr = current;
                    current = current.next;
                }
                dup = false;
            }
        }
        if(dup){
            ptr.next=current.next;
        }
        return temp.next;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3,new
                ListNode(4,new ListNode(4,new ListNode(5,null)))))));
        System.out.println(ListNode.toString(deleteDuplicates(l1)));
    }
}
