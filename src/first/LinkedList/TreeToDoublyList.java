package first.LinkedList;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
    public static String toString(Node root) {
        StringBuilder builder = new StringBuilder();
        if (root == null)
            return "";
        builder.append(toString(root.left));
        builder.append(toString(root.right));
        return builder.append(root.val).toString();
    }
}
public class TreeToDoublyList {
    static Node first = null;
    static Node last = null;
    public static void helper(Node node) {

        if (node != null) {

            helper(node.left);
            if (last != null) {
                last.right = node;
                node.left = last;
            } else first = node;
            last = node;
            helper(node.right);
        }
    }
    public static Node treeToDoublyList(Node root) {
    if(root==null) return null;
    helper(root);
    root.right=first;
    first.left=root;
    return first;
    }
    public static void main(String[] args) {
    Node node=new Node(4,new Node(2,new Node(1),new Node(3)),new Node(5));
        System.out.println(Node.toString(treeToDoublyList(node)));
    }
}
