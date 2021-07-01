package first.LinkedList;

public class SearchInLinkedList {
    public static int search(ListNode head,int x){
        ListNode dummy=head;int index=1;
        while(dummy!=null){
            if(dummy.getVal()==x){
                dummy=dummy.next;
                return index;
            }
            else {
                dummy=dummy.next;
                index++;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        ListNode node=new ListNode(10,new ListNode(5,new ListNode(20,new ListNode(15,null))));
        System.out.println(search(node,20));
    }
}
