package first.LinkedList;

public class DeleteDuplicates2 {

    public static  ListNode deleteduplicates2(ListNode head){
        ListNode dummynode=new ListNode(0);
        dummynode.next=head;
        ListNode first=dummynode;
        ListNode second=dummynode.next;
        Integer elementoremove=null;
        while(second!=null && second.next!=null){
            if(second.val==second.next.val){
                elementoremove=second.val;
            }
            if(elementoremove!=null ){
                second=second.next;
                first.next=second;
                elementoremove=null;
            }else{
                first=first.next;
                second=second.next;
            }
        }
        return dummynode.next;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, new ListNode(2,new ListNode(3, new ListNode(3
                , new ListNode(4, new ListNode(4,new ListNode(5,null)))))));
        //ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        ListNode resultnode=deleteduplicates2(node1);
        System.out.println(ListNode.toString(resultnode));
    }
}
