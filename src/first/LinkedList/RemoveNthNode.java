package first.LinkedList;

 class ListNode {
     int val;
    ListNode next;

     public int getVal() {
         return val;
     }

     public void setVal(int val) {
         this.val = val;
     }

     public ListNode getNext() {
         return next;
     }

     public void setNext(ListNode next) {
         this.next = next;
     }

     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     public static String toString(ListNode head) {
         String result = "";
         ListNode current = head;
         while(current != null){
             result += current.getVal();
             if(current.getNext() != null){
                 result += " ";
             }
             current = current.getNext();
         }
         return result;
     }
 }
public class RemoveNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy=new ListNode(0);
       dummy.next=head;
       ListNode first=dummy;
       ListNode second=dummy;
       // maintaing a 2 -node gap between first and second
       for(int i=1;i<=n+1;i++){
           first=first.next;
       }
       while (first!=null){
           first=first.next;
           second=second.next;
       }
       second.next=second.next.next;
       return dummy.next;

    }
    public static void main(String[] args) {
        ListNode  node=new ListNode(1,(new ListNode(2,(new ListNode(3,new ListNode(4,new ListNode(5,null)))))));
        int n=1;
        ListNode result=removeNthFromEnd(node,n);
        System.out.println(ListNode.toString(result));
    }
}
