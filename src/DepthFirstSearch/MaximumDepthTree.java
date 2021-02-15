package DepthFirstSearch;

import java.util.Map;

public class MaximumDepthTree {
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
    }
    public static int maxDepth(TreeNode root){
        if(root==null) return 0;
        int left_depth=maxDepth(root.left);
        int right_depth=maxDepth(root.right);
        return Math.max(left_depth,right_depth)+1;
    }

    public static void main(String[] args) {
        TreeNode node=new TreeNode(1,(new TreeNode(2,new TreeNode(3),new TreeNode(4))),(new TreeNode(2,new TreeNode(4),new TreeNode(3))));
        System.out.println(maxDepth(node));
    }
}
