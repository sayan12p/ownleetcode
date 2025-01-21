package DynamicProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class Findfirstkmaximumoccurringwords {


    public static List<String> findKfrequentWords(String[] dict, int k){
        //You can code here
        List<String> worddict= Arrays.stream(dict).toList();
        WordBreak.TrieNode root=new WordBreak.TrieNode();
        WordBreak.insertwords(worddict,root);
        Map<String,Integer> map=findkmostfrequentwords(worddict,root);
        System.out.println(map);
        return findkmostfrequentwords(worddict,root)
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder()))
                .limit(k)
                .map(Map.Entry::getKey).collect(Collectors.toUnmodifiableList());

    }

    public static Map<String,Integer> findkmostfrequentwords(List<String>  worddict, WordBreak.TrieNode root){
        int a=0;
        Map<String,Integer> freqmap=new LinkedHashMap<>();
        freqmap.put(worddict.get(0),1);
        while(++a<worddict.size()){
            String s=worddict.get(a);
            int length=s.length();
            boolean good[] =new boolean[s.length()+1];
            good[0]=true;
            for(int i=0;i<length;i++){
                if(good[i]){
                    WordBreak.TrieNode node=root;
                    for(int j=i;j<length;j++){
                        if(node==null) break;
                        node=node.children[s.charAt(j)-'a'];
                        if(node != null && node.isendofword) {
                            good[j+1]=true;
                            freqmap.put(s,freqmap.getOrDefault(s,0)+1);
                            break;
                        }
                    }
                }
            }
        }
        return freqmap;
    }
    public static void main(String[] args) {
        String arr[] = {"code", "coder", "coding", "codable", "codec", "codecs", "coded", "codeless", "codec", "codecs", "codependence", "codex", "codify", "codependents", "codes", "code", "coder", "codesign", "codec", "codeveloper", "codrive", "codec", "codecs", "codiscovered"};
        System.out.println(findKfrequentWords(arr,4));
    }
}
