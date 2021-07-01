package Sort;

public class MergeSortDoublyLinkedList {
    static class ListNode
    {
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
    public static ListNode MergeSortList(ListNode head){
      ListNode current=head;
      ListNode second=head;
      if(current==null || current.next==null) return current;
      second=findMiddle(current);
      current=MergeSortList(current);
      second=MergeSortList(second);
   return MergeList(current,second);

    }
    public static ListNode findMiddle(ListNode cur){
        ListNode slow=cur;
        ListNode fast=cur;
        while(fast!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode temp=slow.next;
        slow.next=null;
        return temp;
    }
    public static ListNode MergeList(ListNode first, ListNode second){
        ListNode answer=null;
        if(first==null) return second;
        if(second==null) return first;
        if(first.val<=second.val){
            answer=first;
            answer.next=MergeList(first.next,second);
        }
        else{
            answer=second;
            answer.next=MergeList(first,second.next);
        }
        return answer;
    }
    public static ListNode sortDoubly(ListNode head)
    {
        return MergeSortList(head);
    }
    public static void main(String[] args) {
    ListNode head=new ListNode(7,new ListNode(5,new ListNode(3,new ListNode(2,new ListNode(6,new ListNode(4,new ListNode(1, new ListNode(8,null))))))));
        System.out.println(sortDoubly(head).toString());
    }
}
