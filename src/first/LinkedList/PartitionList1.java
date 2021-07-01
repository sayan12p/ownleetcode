package first.LinkedList;



public class PartitionList1 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        public String toString() {
            String result = val+ " ";
            if (next != null) {
                result += next.toString();
            }
            return result;
        }
    }
    public static ListNode partition(ListNode head, int x) {
        ListNode p=new ListNode();
        ListNode q=new ListNode();
        ListNode before=p,after=q;
        while(head!=null){
            if(head.val<x){
                before.next=head;
                before= before.next;
            }
            else{
                after.next=head;
                after=after.next;
            }
            head=head.next;
        }
after.next=null;
        before.next=q.next;
return  p.next;
    }
    public static void main(String args[]){
        ListNode node1 = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5,new ListNode(2,null))))));
        /*ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));*/
        int x=3;
        ListNode resultnode=partition(node1,x);
        System.out.println(resultnode.toString());
    }
}
