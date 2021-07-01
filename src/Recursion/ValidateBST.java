package Recursion;

public class ValidateBST {
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
    public static boolean isValidBST(TreeNode root){
    return isValidHelper(root,null,null);
    }
    public static boolean isValidHelper(TreeNode root, Integer min, Integer max){
        if(root==null) return true;
        if(min!=null && root.val<=min) return false;
        if(max!=null && root.val>max) return false;
        return isValidHelper(root.left,min,root.val) && isValidHelper(root.right,root.val,max);
    }
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(5,new TreeNode(1,null,null),new TreeNode(6,new TreeNode(3),new TreeNode(6)));
        System.out.println(isValidBST(tree));
    }

}
