package DepthFirstSearch;

public class SameTree {
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
    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null) return  true;
        else if(p==null || q==null) return false;
        else if(p.val!=q.val) return false;

        else{
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }
    public static void main(String args[]){
        TreeNode node1=new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode node2=new TreeNode(1,new TreeNode(2),new TreeNode(3));
        System.out.println(isSameTree(node1,node2));
    }
}
