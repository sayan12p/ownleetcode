package first.LinkedList;

public class IsListPalindrome {
    public static int isPalindrome(ListNode A) {
        if(A==null||A.next==null){
            return 1;
        }
        ListNode current=A;
        ListNode fast=A;
        ListNode mid=A;
        int  flag=1;
        while(fast.next !=null && fast.next.next!=null){
            mid=mid.next;
            fast=fast.next.next;

        }

        mid.next=reverseList(mid.next);
        mid=mid.next;
        while(mid !=null ){
            if(A.val !=mid.val){
                flag=0;
            }A=A.next;
            mid=mid.next;
        }
        return flag;
    }
    public static ListNode reverseList(ListNode head){
        ListNode current =head;
        ListNode prev=null;
        ListNode next=null;
        while(current !=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;
    }


    public static void main(String[] args) {
      ListNode list=new ListNode(8,new ListNode(1,null));
        System.out.println(isPalindrome(list));
    }
}
