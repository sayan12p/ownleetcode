package DynamicProgramming;

import java.util.*;

public class maximumoccurringwordinagivensetofstrings {

    public static String findMostFreq(List<String> words, int n){
        //You can code here
        WordBreak.TrieNode root=new WordBreak.TrieNode();
        WordBreak.insertwords(words,root);
        Map<String,Integer> map=findfreq(words,root);
        System.out.println(map);
       return map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
    }

    public static Map<String,Integer> findfreq(List<String> words, WordBreak.TrieNode root) {
        int a = 0;
        Map<String, Integer> freq = new HashMap<>();
        freq.put(words.get(0), 1);
        while (++a < words.size()) {
            String s = words.get(a);
            boolean good[] = new boolean[s.length() + 1];
            good[0] = true;
            for (int i = 0; i < s.length(); i++) {
                if (good[i]) {
                    WordBreak.TrieNode node = root;
                    for (int j = i; j < s.length(); j++) {
                        if (root == null) break;
                        node = node.children[s.charAt(j) - 'a'];
                        if (node != null && node.isendofword) {
                            good[j + 1] = true;
                            freq.put(s, freq.getOrDefault(s, 0) + 1);
                            break;
                        }
                    }
                }
            }
        }
        return freq;
    }


    public static void main(String[] args) {
       List<String> words= Arrays.asList( "code","compiler","code");
        System.out.println(findMostFreq(words,3));
    }
}
