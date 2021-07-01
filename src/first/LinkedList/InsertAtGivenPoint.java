package first.LinkedList;

public class InsertAtGivenPoint {
    public static ListNode insertPo(ListNode head,int pos,int data){
        ListNode insert=new ListNode(data);
        ListNode curr=head;int index=1;
        while(curr!=null){
            if(pos==index){
                insert.next=curr.next;
                curr.next=insert;
                index++;
            }
            else{
                curr=curr.next;
                index++;
            }
        }


    return head;
    }
    public static void main(String[] args) {
        ListNode node=new ListNode(10,new ListNode(5,new ListNode(20,new ListNode(15,null))));
        System.out.println(ListNode.toString(insertPo(node,2,11)));

    }
}
