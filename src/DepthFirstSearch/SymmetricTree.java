package DepthFirstSearch;

public class SymmetricTree {
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
    public static boolean isSymmetric(TreeNode root) {
return mirror(root,root);
    }
    public static boolean mirror(TreeNode a,TreeNode b){
        if(a==null && b==null) return true;
        else if(a==null || b==null) return false;
        else if(a.val !=b.val) return  false;
        else{
            return mirror(a.left,b.right) && mirror(a.right,b.left);
        }
    }

    public static void main(String[] args) {
        TreeNode node=new TreeNode(1,(new TreeNode(2,new TreeNode(3),new TreeNode(4))),(new TreeNode(2,new TreeNode(4),new TreeNode(3))));

      /*  node.left =new TreeNode(2);
        node.right=new TreeNode(2);
        node.left.left=new TreeNode(3);
        node.left.right=new TreeNode(4);
        node.right.left=new TreeNode(4);
        node.right.right=new TreeNode(3);*/
        System.out.println(isSymmetric(node));
    }
}
