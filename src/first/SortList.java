package first;



public class SortList {
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
    public static void reorderList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null)
            return;
        ListNode mid=head;
        ListNode cur=head;
        while(cur!=null && cur.next!=null){
            cur=cur.next.next;
            mid=mid.next;
        }
        ListNode right=mid.next;
        mid.next=null;
        cur=right.next;
        right.next=null;
        ListNode tmp;
        //reverse right
        while(cur!=null){
            tmp=cur.next;
            cur.next=right;
            right=cur;
            cur=tmp;
        }
        cur=head;
        //reorder
        while(right!=null){
            tmp=right.next;

            right.next=cur.next;
            cur.next=right;
            cur=right.next;
            right=tmp;

        }
    }
    public static void main(String args[]){
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,null))));
        /*ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));*/

        reorderList(node1);
        System.out.println(node1);
    }
}
