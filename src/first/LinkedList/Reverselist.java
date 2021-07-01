package first.LinkedList;

public class Reverselist {
       public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        ListNode second = head;
        ListNode firstprev = null;
        ListNode secondnext =null;
        for (int i = 1; i <= right+1; i++) {
            head = head.next;
            if (i <= left - 1) {
                firstprev = first;
            }
            if (i == left - 1) first = head;
            if (i < right ) {
                second = head;
                secondnext=head.next;
             }        }
        second.next=null;
        second=reverse(first);
        if(firstprev!=head){
            firstprev.next=second;

        }else{
            head=second;
        }
        first.next=secondnext;
        return dummy.next;


    }
    public static ListNode reverse (ListNode first){
        ListNode current = first;
        ListNode prev = null;
        ListNode next = null;
        while (current != null ) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
        return first;
    }

    public static void main (String[]args){
        ListNode node = new ListNode(1, (new ListNode(2, (new ListNode(3, new ListNode(4, new ListNode(5, null)))))));
        System.out.println(ListNode.toString(reverseBetween(node, 2, 4)));
    }


}