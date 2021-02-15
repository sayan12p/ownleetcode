package first;

public class SortListtoBST {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        /*public String toString() {
            String result = val+ " ";
            if (next != null) {
                result += next.toString();
            }
            return result;
        }*/
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public static String toString(TreeNode node) {
            String result = "";
            if (node == null)
                return "";
            result += node.val+" ";
            result += toString(node.left)+" ";
            result += toString(node.right)+" ";

            return result;
        }
    }

        public static ListNode findmiddleElement(ListNode head) {
             ListNode prevptr = null;
            ListNode slowptr = head;
            ListNode fastptr = head;
            while (fastptr != null && fastptr.next != null) {
                prevptr = slowptr;
                slowptr = slowptr.next;
                fastptr = fastptr.next.next;
            }
            if (prevptr != null) {
                prevptr.next = null;
            }
            return slowptr;
        }

        public static TreeNode sortedListToBST(ListNode head) {

            if (head == null)
                return null;
            ListNode mid = findmiddleElement(head);
            TreeNode node = new TreeNode(mid.val);
            if (head == mid)
                return node;
            node.left = sortedListToBST(head);
            node.right = sortedListToBST(mid.next);
            return node;

        }

        public static void main(String args[]) {
            ListNode node1 = new ListNode(-10, new ListNode(-3, new ListNode(0, new ListNode(5, new ListNode(9, null)))));
        /*ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));*/
            //int x=3;
            TreeNode resultnode = sortedListToBST(node1);
            System.out.println(resultnode.toString(resultnode));
        }
    }

