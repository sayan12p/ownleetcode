package first.String;

import java.util.HashMap;

public class LongestSubstringwithAtMostTwoDistinctCharacters {
    //sliding window
    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character,Integer> frequencymap=new HashMap<>();
        int start = 0;int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++) {
            char[] chars = s.toCharArray();
            frequencymap.put(chars[i], frequencymap.getOrDefault(chars[i], 0) + 1);
             if (frequencymap.size() > 2) {
                max = Math.max(i-start, max);
                while (frequencymap.size()>2){
                    char ch=s.charAt(start);
                    int count= frequencymap.getOrDefault(ch,0);
                    if(count>1){
                        frequencymap.put(ch,frequencymap.getOrDefault(ch,0)-1);
                    }else{
                        frequencymap.remove(ch);
                    }
                    start++;
                }
            }
        }

        max = Math.max(max, s.length()-start);
        return max;
    }
    public static void main(String[] args) {
        String s="ninjacoder";
        System.out.println(lengthOfLongestSubstringTwoDistinct(s));
    }
}
