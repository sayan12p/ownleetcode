package first.LinkedList;

public class Reverselist1 {
    public static ListNode reverselist(ListNode first){
        ListNode next=null;
        ListNode prev=null;
        ListNode current=first;
        while(current!=null){
         next=current.next;
         current.next=prev;
         prev=current;
         current=next;
}
        first=prev;
        return first;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, (new ListNode(2, (new ListNode(3, new ListNode(4, new ListNode(5, null)))))));
        System.out.println(ListNode.toString(reverselist(node)));
    }
}
