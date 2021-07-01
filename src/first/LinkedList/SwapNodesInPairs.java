package first.LinkedList;

public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {

    ListNode temp=new ListNode();
   temp.next=head;
    ListNode current=temp;
    while (current.next!=null && current.next.next!=null){
        ListNode first=current.next;
        ListNode second=current.next.next;
        first.next=second.next;
        current.next=second;
        current.next.next=first;
        current=current.next.next;
    }
    return temp.next;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,null))));
        System.out.println(ListNode.toString(swapPairs(l1)));
    }
}
