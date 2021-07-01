package first.String;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    //https://www.youtube.com/watch?v=e1HlptlipB0&t=1322s
    public static String minWindow(String s, String t) {
        Map<Character,Integer> frequencymapt=new HashMap<>();
        Map<Character,Integer> frequencymaps=new HashMap<>();
        int matchcount=0;
        int desiredmatchcount=t.length();
        String ans="";
        for(int i=0;i<t.length();i++){
            char[] c=t.toCharArray();
            frequencymapt.put(c[i],frequencymapt.getOrDefault(c[i],0)+1);
        }
        int i=-1,j=-1;
        while(true){
            boolean f1=false;
            boolean f2=false;
            while(i<s.length()-1 && matchcount<desiredmatchcount) {
                i++;
                char ch = s.charAt(i);
                frequencymaps.put(ch, frequencymaps.getOrDefault(ch, 0) + 1);
                if (frequencymaps.getOrDefault(ch, 0) <= frequencymapt.getOrDefault(ch, 0)) {
                    matchcount++;
                }
                f1=true;
            }
            //collect answers and release
            while(j<i && matchcount==desiredmatchcount){
                String potentialans=s.substring(j+1,i+1);
                if(ans.length()==0|| potentialans.length()<ans.length()){
                    ans=potentialans;
                }
                j++;
                char ch=s.charAt(j);
                if(frequencymaps.get(ch)==1){
                    frequencymaps.remove(ch);
                }else{
                    frequencymaps.put(ch,frequencymaps.get(ch)-1);
                }
                //if we are releasing a character which is present in the substring to be matched.
                if(frequencymaps.getOrDefault(ch,0)<frequencymapt.getOrDefault(ch,0)){
                    matchcount--;
                }
                f2=true;
            }
            if(f1==false && f2==false){
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        System.out.println(minWindow(s,t));
    }
}
