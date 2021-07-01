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
    public static void oddEvenList1(ListNode head){
        if(head==null) return ;
        ListNode oddList=new ListNode(0);ListNode dummyodd=oddList;
        ListNode evenList=new ListNode(0);ListNode dummyeven=evenList;
        ListNode odd=head;
        ListNode even=head.next;
        while(odd!=null) {
            dummyodd.next = odd;
            if (odd.next != null) {
                odd = odd.next.next;
            } else odd = odd.next;
            dummyodd = dummyodd.next;
            while (even != null) {
                dummyeven.next = even;
                if (even.next!=null) {
                    even = even.next.next;
                } else even = even.next;
                dummyeven = dummyeven.next;
            }
        }

}
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5,null))
        )));
        oddEvenList1(node1);
    }
}
