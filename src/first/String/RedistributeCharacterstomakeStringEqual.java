package first.String;

import java.util.Arrays;

public class RedistributeCharacterstomakeStringEqual {

     static boolean makeEqual(String[] words) {
        int[] charfreq=new int[26];
         Arrays.fill(charfreq,0);
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                charfreq[ch-'a']++;
            }
        }
       for(int i=0;i<charfreq.length;i++){
           if(charfreq[i]% words.length!=0) return false;
       }
       return true;
    }
    public static void main(String[] args) {
        String[] words = new String[]{"abc","aabc","bc"};
        System.out.println(makeEqual(words));
    }
}
