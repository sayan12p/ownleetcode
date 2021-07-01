package Recursion;

public class MaxDepthBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
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

    public static int maxDepth(TreeNode root) {
    if(root==null) return 0;
    // maxdepth will be the Math.max of the left subtree and right subtree
    int maxdepth=1+Math.max(maxDepth(root.left),maxDepth(root.right));
    return maxdepth;
    }

    public static void main(String[] args) {
    TreeNode tree=new TreeNode(3,new TreeNode(9,null,null),new TreeNode(20,new TreeNode(15),new TreeNode(20)));
        System.out.println(maxDepth(tree));
    }
}
