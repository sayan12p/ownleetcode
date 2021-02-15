package first;

public class ReverseList {

    private static boolean stop;
    private static ListNode left;

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
    public static void RecurseAndReverse(ListNode right, int m, int n) {


        if(n==1)
            return;
        right=right.next;
        if(m>1)
            left=left.next;

        RecurseAndReverse(right,m-1,n-1);
        if(left==right|| right.next==left){
            stop=true;
        }
        if(!stop){
            int t=left.val;
            left.val=right.val;
            right.val=t;
            left=left.next;
        }


    }
    private static ListNode reverseBetween(ListNode head,int m, int n){
        left=head;
        stop=false;
        RecurseAndReverse(head,m,n);
        return head;

    }
    public static void main(String args[]){
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));
        /*ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));*/
        int m=2;
        int n=4;
        ListNode resultnode=reverseBetween(node1,m,n);
        System.out.println(resultnode.toString());
    }
}
