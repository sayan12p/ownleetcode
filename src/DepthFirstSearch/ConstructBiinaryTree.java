package DepthFirstSearch;

public class ConstructBiinaryTree {

    //from inorder and preorder
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
    static TreeNode buildTreeHelper(int [] inorder,int[] preorder, int startin,int endin,int startpre,int endpre){
        if(startin>endin) return null;
        int rootData=preorder[startpre];
        int rootIndex=-1;
        for(int i=startin;i<=endin;i++){
            if(inorder[i]== rootData) {
                rootIndex = i;
                break;
            }
        }
        int lInS=startin;
        int lInE=rootIndex-1;
        int lPreS=startpre+1;
        int lPreE=lInE-lInS+lPreS;
        int rPreS=lPreE+1;;
        int rPreE=endpre;
        int rInS=rootIndex+1;
        int rInE=endin;
        //int lefttreesize=rootIndex-startin;
        TreeNode root=new TreeNode(rootData);
        root.left=buildTreeHelper(inorder,preorder,lInS,lInE,lPreS,lPreE);
        root.right=buildTreeHelper(inorder,preorder,rInS,rInE,rPreS,rPreE);
        return root;
    }
    static TreeNode buildTree(int[] inorder,int[] preorder,int size ){
        return buildTreeHelper(inorder,preorder,0,size-1,0,size-1);
    }
    public static void main(String[] args) {
        //TreeNode node=new TreeNode(1,(new TreeNode(2,new TreeNode(3),new TreeNode(4))),(new TreeNode(2,new TreeNode(4),new TreeNode(3))));
        int []preorder = {3,9,20,15,7};
        int []inorder = {9,3,15,20,7};
        TreeNode root=buildTree(inorder,preorder,5);
        System.out.println(root.val+""+root.left.val+root.right.val);
    }
}
