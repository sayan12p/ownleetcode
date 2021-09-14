package first.LinkedList;

public class IsListPalindrome {
    public static boolean isPalindrome(ListNode A) {
        if(A==null||A.next==null){
            return false;
        }
        ListNode current=A;
        ListNode fast=A;
        ListNode mid=A;
        boolean  flag=true;
        while(fast.next !=null && fast.next.next!=null){
            mid=mid.next;
            fast=fast.next.next;

        }
        mid.next=reverseList(mid.next);
        mid=mid.next;
        while(mid !=null ){
            if(A.val !=mid.val){
                flag=false;
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
      ListNode list=new ListNode(8,new ListNode(1,new ListNode(1,new ListNode(8,null))));
        System.out.println(isPalindrome(list));
    }
}
