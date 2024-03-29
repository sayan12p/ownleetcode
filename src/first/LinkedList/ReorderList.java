package first.LinkedList;

public class ReorderList {
    public static void reorderList(ListNode head) {
    if(head==null|| head.next==null) return;
    //head of first half
    ListNode l1=head;
    //headof 2nd half
    ListNode slow=head;
    ListNode fast=head;
    //tail of  2nd half
    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    ListNode l2=reverse(slow.next);
    slow.next=null;
    mergelist(l1,l2);
    }

    private static void mergelist(ListNode l1, ListNode l2) {
        while (l1 != null && l2!=null) {
            ListNode l1_next = l1.next;
            ListNode l2_next = l2.next;
            l1.next = l2;
//            if (l1_next == null) {
//                break;
//            }
            l2.next=l1_next;
            l1=l1_next;
            l2=l2_next;

        }
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev=null;
        ListNode current_node=head;
        while(current_node!=null ){
            ListNode node_next=current_node.next;
            current_node.next=prev;
            prev=current_node;
            current_node=node_next;

        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(8, new ListNode(9, new ListNode(11,null)))));
        reorderList(node1);
        System.out.println(ListNode.toString(node1));
    }
}
