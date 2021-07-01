package first;

public class Second {

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
	public static ListNode RemoveNthNode(ListNode l1,int n) {
		ListNode dummynode=new ListNode(0);
		dummynode.next=l1;
		ListNode first=l1;
		int length=0;
		while(first!=null) {
			length++;
			first=first.next;
			
		}
		length=length-n;
		first=dummynode;
		while(length >0) {
			length--;
			first=first.next;
		}
		first.next=first.next.next;
		return l1;
		
	}
	public static void main(String args[]) {
		
		ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));
		ListNode resultnode=RemoveNthNode(node1,2);
		System.out.println(resultnode.toString());
	}
}
