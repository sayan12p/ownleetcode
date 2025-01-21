package first.LinkedList;



public class InsertionSortList {


    public static ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(0);
        while(head!=null){
            ListNode next=head.next;
            ListNode temp=dummy;
            while( temp.next!=null && temp.next.val<head.val) {
                temp=temp.next;
            }
            head.next=temp.next;
            temp.next=head;
            head=next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(-1,new ListNode(5,new ListNode(3,new ListNode(4,new ListNode(0,null)))));
        System.out.println(ListNode.toString(insertionSortList(a)));
    }
}

//dummy->0
// head-> -1,5,3,4,0
