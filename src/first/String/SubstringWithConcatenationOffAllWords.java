package first.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationOffAllWords {
    public static List<Integer> findSubstring(String s, String[] words) {//words="foo","bar"
    if(s==null || s.length()==0 || words==null || words.length==0)
        return null;
        Map<String,Integer> map=new HashMap<>();
        for(String word:words){
            if(!map.containsKey(word))
            map.put(word,1);
            else map.put(word,map.get(word)+1);
        }
        int wordslength=words[0].length();
        int wordCount=words.length;
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<s.length()-wordCount*wordslength;i++){
            Map<String ,Integer> seenWords=new HashMap<>();
            for(int j=0;j<wordCount;j++){
                int wordIndex=i+j*wordslength;
                String word=s.substring(wordIndex,wordIndex+wordslength);
                if(!map.containsKey(word))
                    break;
                seenWords.put(word,seenWords.getOrDefault(word,0)+1);
                if(seenWords.get(word)>map.get(word))
                    break;
                if(j+1==wordCount){
                    result.add(i);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s="barfoofoobarthefoobarman";
        String words[]={"bar","foo","the"};
        System.out.println(findSubstring(s,words).toString());
    }
}
