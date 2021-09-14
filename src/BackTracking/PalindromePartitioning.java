package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        backtrack(0,result,new ArrayList<>(),s);
        return result;
    }

    private static void backtrack(int start,List<List<String>> result,List<String> subset,String s) {
        if(start>=s.length()){
            result.add(new ArrayList<>(subset));
        }
        for(int end=start;end<s.length();end++){
            if(checkPalindrome(start,end,s)){
                subset.add(s.substring(start,end+1));
                backtrack(end+1,result,subset,s);
                subset.remove(subset.size()-1);
            }
        }

    }
    public static boolean checkPalindrome(int start,int end,String s){
        while(start<end ){
          if( s.charAt(start)!=s.charAt(end))
            return false;
            start++;// starting at the middle and looping outwards.
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(partition("cacfg").toString());
    }
}
