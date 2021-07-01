package first.LinkedList;

public class LinkedListIntersection {
    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(9, new ListNode(1,new ListNode(2,new ListNode(4,null)))));
        ListNode node1= new ListNode(3, new ListNode(2, new ListNode(4, null)));
        ListNode result = checkmid(node, node1);
        System.out.println(ListNode.toString(result));
    }

    private static ListNode checkmid(ListNode node, ListNode node1) {
        ListNode dummy=new ListNode(0);
        dummy.next=node;
        ListNode head=node;
        ListNode head1=node1;
        while(head!=null){
        while(head1!=null){
                if(head.val==head1.val){
                    dummy=head;
                    dummy.next=null;
                    return dummy;
                }
               head1=head1.next;
        }
        head1=node1;
        head=head.next;
        }
        return null;
    }


}
