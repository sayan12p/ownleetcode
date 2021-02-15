package first.String;


import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
               // System.out.println(s.substring(i,j-i));
                if(allUnique(s,i,j))
                    ans=Math.max(ans,j-i);
            }
            }


        return ans;
    }
    public static boolean allUnique(String s, int start, int end){
        Set<Character> set=new HashSet<>();
        for(int i=start;i<end;i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));

            }else return false;


        }
      return true;
    }
    public static void main(String[] args) {
    String s="pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
