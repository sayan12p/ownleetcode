package first.LinkedList;

public class MergeList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null || l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode dummy=new ListNode();
        ListNode ptr=dummy;
        while (l1!=null && l2!=null) {
            if (l1.val <= l2.val) {
                ptr.next = l1;
                l1 = l1.next;
                ptr = ptr.next;
            } else {
                ptr.next = l2;
                l2 = l2.next;
                ptr = ptr.next;
            }
            ptr.next=(l1!=null)?l1:l2;

        }
        return dummy.next;
    }

    public static void main(String[] args) {
    ListNode l1=new ListNode(1,new ListNode(2,new ListNode(4,null)));
    ListNode l2=new ListNode(1,new ListNode(3,new ListNode(4,null)));
    ListNode result=mergeTwoLists(l1,l2);
        System.out.println(ListNode.toString(result));
    }
}
