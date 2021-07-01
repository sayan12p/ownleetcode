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
    ListNode dummyhead=new ListNode(head.val);
    dummyhead.next=head;
    ListNode first=dummyhead;
    ListNode second=dummyhead.next;
    Integer elemnetremove=null;
    while(second!=null && second.next!=null) {
        if (second.val == second.next.val) {
            elemnetremove = second.val;
        }
        if (elemnetremove != null && second.val == elemnetremove) {
            second = second.next;
            first.next = second;
        } else {
            first = first.next;
            second = second.next;
        }
    }
    if(elemnetremove!=null && first.next.val==elemnetremove && first.next!=null){
        first.next=null;
    }

    return dummyhead.next;
    }
    public static void main(String args[]){
        ListNode node1 = new ListNode(1, new ListNode(1,new ListNode(2, new ListNode(2
                , new ListNode(4, new ListNode(5,null))))));
        //ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        ListNode  resultnode=DeleteDuplicates(node1);
        System.out.println(resultnode.toString());
    }
}
