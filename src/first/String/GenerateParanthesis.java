package first.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParanthesis {
    public static List<String> generateParanthesis(int n){
        ArrayList<String> ans=new ArrayList<>();
        backtrack(ans,new StringBuilder(),0,0,n);
        return ans;
    }
    public static void backtrack(ArrayList ans,StringBuilder cur,int open,int close,int max){

        if(cur.length()==2*max){
            ans.add(cur.toString());
            return;
        }
        if(open<max){
           cur.append("(");
           backtrack(ans,cur,open+1,close,max);
           cur.deleteCharAt(cur.length()-1);
        }
        if(close<open){
            cur.append(")");
            backtrack(ans,cur,open,close+1,max);
            cur.deleteCharAt(cur.length()-1);
        }
    }
    public static void main(String[] args) {
    List<String> result=generateParanthesis(2);
        System.out.println(result);
    }
}
