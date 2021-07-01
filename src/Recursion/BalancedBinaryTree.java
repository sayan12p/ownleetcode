package Recursion;

public class BalancedBinaryTree {
    public static boolean isBalanced(ValidateBST.TreeNode root) {
    if(root==null) return true;
    boolean result=false;
    int lh=height(root.left);
    int rh=height(root.right);
    if(Math.abs(lh-rh)<=1){
        result=true;
    }
    return result && isBalanced(root.left) && isBalanced(root.right);

    }
    private static int height(ValidateBST.TreeNode root){
        if(root==null)
            return 0;
        int height=Math.max(height(root.left),height(root.right))+1;
        return height;
    }
    public static void main(String[] args) {
        ValidateBST.TreeNode tree=new ValidateBST.TreeNode(5,new ValidateBST.TreeNode(1,null,null),new ValidateBST.TreeNode(6,new ValidateBST.TreeNode(3),new ValidateBST.TreeNode(6)));
        System.out.println(isBalanced(tree));
    }
}
