package first.LinkedList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class AddTwoNumbers{
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

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}
	
	
	public static void main(String []argh) throws IOException
	{
		//Scanner sc = new Scanner(System.in);
		
		ListNode node1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9,null))
		)));
		ListNode node2 = new ListNode(8, new ListNode(6, new ListNode(4, null)));
		 ListNode result=addTwoNumbers( node1, node2);
		 
		 System.out.print(result.toString());
		
		
            //Complete the code
			
		
		
	}

	
}
