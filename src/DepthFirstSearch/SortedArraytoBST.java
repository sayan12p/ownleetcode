package DepthFirstSearch;

public class SortedArraytoBST {
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
                return toString(r.left) + " "+r.val+" "  +toString(r.right) ;
        }
    }
    public static TreeNode sortedArrayToBST(int[] nums){
        if(nums.length==0|| nums==null) return null;
        return constructBST(nums,0,nums.length-1);
    }
    public static TreeNode constructBST(int[] nums,int startin,int endin){
        if(startin>endin){
            return null;
        }
        int mid=startin+(endin-startin)/2;
        TreeNode current=new TreeNode(nums[mid]);
        current.left=constructBST(nums,0,mid-1);
        current.right=constructBST(nums,mid+1,endin);
        return current;

    }
    public static void main(String[] args) {
        int nums[]={-10,-3,0,5,9};
        TreeNode root=sortedArrayToBST(nums);
        System.out.println(root.left.val);
    }
}
