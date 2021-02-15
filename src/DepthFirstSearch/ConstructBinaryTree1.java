package DepthFirstSearch;

public class ConstructBinaryTree1 {
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
        public static String toString(TreeNode r){
            if(r==null)
                return "";
            else
                return toString(r.left) + " " +r.val + " " +toString(r.right);
        }
    }
    public static TreeNode buildTree(int[] inorder,int[] postorder){
        int len=inorder.length;
        return buildTreeHelper(inorder,postorder,0,len-1,0,len-1);
    }
    private static TreeNode buildTreeHelper(int[] inorder, int[] postorder,int instart,int inEnd,int postStart,int postEnd){
        if(instart>inEnd){
            return null;
        }
        int rootval=postorder[postEnd];
        TreeNode root=new TreeNode(rootval);
        int rootIndex=instart;
        for(;rootIndex<=inEnd;rootIndex++){
            if(inorder[rootIndex]==rootval){
                break;
            }
        }
        int leftTreeSize=rootIndex-instart;
        int rightTreeSize=inEnd-rootIndex;
        root.left=buildTreeHelper(inorder,postorder,instart,rootIndex-1,postStart,postStart+leftTreeSize-1);
        root.right=buildTreeHelper(inorder,postorder,rootIndex+1,inEnd,postEnd-rightTreeSize,postEnd-1);
        return root;
    }
    public static void main(String[] args) {
        //TreeNode node=new TreeNode(1,(new TreeNode(2,new TreeNode(3),new TreeNode(4))),(new TreeNode(2,new TreeNode(4),new TreeNode(3))));
        int []postorder = {9,15,7,20,3};
        int []inorder = {9,3,15,20,7};
        TreeNode root=buildTree(inorder,postorder);
        System.out.println(root.val+""+root.left.val+root.right.val);
    }
}
