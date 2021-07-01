package Recursion;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    static ArrayList<Integer> list=new ArrayList<>();
    public static List<Integer> rightSideView(ValidateBST.TreeNode root) {

        levelorder(root,0);
        return list;
    }

    private static void levelorder(ValidateBST.TreeNode node, int level) {
        if(node==null){
            return;
        }
        if(list.size()==level)
            list.add(node.val);
        levelorder(node.right,level+1);
        levelorder(node.left,level+1);
    }

    public static void main(String[] args) {
        ValidateBST.TreeNode root=new ValidateBST.TreeNode(5,new ValidateBST.TreeNode(1,null,null),new ValidateBST.TreeNode(6,new ValidateBST.TreeNode(3),new ValidateBST.TreeNode(6)));
        System.out.println(rightSideView(root).toString());
    }
}
