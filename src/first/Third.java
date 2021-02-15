package first;

public class Third {
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
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode p=new ListNode();
    ListNode p1=p;
    while(l1!=null || l2!=null){
        if(l1==null && l2!=null){
            p1.next=l2;
            l2=l2.next;
        }
        else if(l1!=null && l2==null){
            p1.next=l1;
            l1=l1.next;
        }
        else if(l1.val<l2.val){
            p1.next=l1;
            l1=l1.next;
        }
        else{
            p1.next=l2;
            l2=l2.next;
        }
        p1=p1.next;
    }
    return p.next;
    }

    public static void main(String args[]){
        ListNode node1 = new ListNode(10, new ListNode(12, new ListNode(13, new ListNode(14, new ListNode(15,null)))));
        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        ListNode resultnode=mergeTwoLists(node1,node2);
        System.out.println(resultnode.toString());
    }
}
