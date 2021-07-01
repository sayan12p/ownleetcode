package first.LinkedList;

public class PartitionList {
/*    Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.*/
    public static ListNode partition(ListNode head, int x) {
        ListNode first=new ListNode(0);
        ListNode before=first;
        ListNode second=new ListNode(0);
        ListNode after =second;
        while (head!=null){
            if(head.val<x){
               before.next=head;
               before=before.next;
            }else {
                after.next=head;
                after=after.next;
            }
            head=head.next;
        }
        after.next=null;
        before.next=second.next;
        return first.next;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1,new ListNode(4,new ListNode(3,new ListNode(2,new ListNode(5,new ListNode(2,null))))));
        System.out.println(ListNode.toString(partition(l1,3)));
    }
}
