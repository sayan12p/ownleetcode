package first.String;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    //https://www.youtube.com/watch?v=e1HlptlipB0&t=1322s


    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }

    private static String minWindow(String s, String t) {
        int minlen = Integer.MAX_VALUE;
        int start = -1;
            int[] hash = new int[256];
            for (char c : t.toCharArray()) {
                hash[c]++;
            }

            int l=0; int r=0;
            int count = 0;
            while(r<s.length()){
                if (hash[s.charAt(r)] > 0) {
                    count++;
                }
                hash[s.charAt(r)]--;
                while (count == t.length()) {
                    if (r - l + 1<minlen) {
                        minlen = r - l + 1;
                        start = l;
                    }
                    hash[s.charAt(l)]++;
                    if(hash[s.charAt(l)]>0){
                        count--;
                    }
                    l++;
                }
                r++;
            }
        return s.length() == -1 ? "" : s.substring(start, start + minlen);
    }
}
