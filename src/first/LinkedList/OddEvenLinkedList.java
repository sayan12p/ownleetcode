package first.LinkedList;

public class OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {
   if(head==null) return null;
   ListNode even=head.next;
   ListNode odd=head;
   ListNode evenhead=even;
   while(even!=null && even.next!=null){
       odd.next=even.next;
       odd=odd.next;
       even.next=odd.next;
       even=even.next;
   }
   odd.next=evenhead;
   return head;
    }



    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5,null))
        )));
        System.out.println(ListNode.toString(oddEvenList(node1)));
    }
}
