package first.LinkedList;

public class DeleteDuplicates {
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
    public static ListNode DeleteDuplicates(ListNode head){
    if(head==null)
        return null;
    for( ListNode node = head; node!=null; node=node.next){
        while(node.next!=null && node.val==node.next.val){
            node.next=node.next.next;
        }
    }
    return head;
    }
    public static void main(String args[]){
        ListNode node1 = new ListNode(1, new ListNode(1,new ListNode(2, new ListNode(2
                , new ListNode(4, new ListNode(5,new ListNode(5,null)))))));
        //ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        ListNode  resultnode=DeleteDuplicates(node1);
        System.out.println(resultnode.toString());
    }
}
