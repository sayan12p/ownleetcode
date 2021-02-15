package first;

public class Fourth {
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
    public static ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
    ListNode cur=head;
    ListNode forward=head.next;
    int i=0;
    while(forward!=null){
        if(i%2==0){
            int temp=cur.val;
            cur.val=forward.val;
            forward.val=temp;
        }
        i++;
        cur=cur.next;
        forward=forward.next;
    }
     return head;
    }


    public static void main(String args[]){
        ListNode node1 = new ListNode(10, new ListNode(12, new ListNode(13, new ListNode(14, new ListNode(15,null)))));
        //ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        ListNode resultnode=swapPairs(node1);
        System.out.println(resultnode.toString());
    }
}
