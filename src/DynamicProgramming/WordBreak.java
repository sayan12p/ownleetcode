package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {

    public static  final int ALPHABET_SIZE=26;
    static  class TrieNode{
        TrieNode[] children;
        boolean isendofword;
        TrieNode(){
            children=new TrieNode[ALPHABET_SIZE];
            for(int i=0;i<ALPHABET_SIZE;i++){
                children[i]=null;
                isendofword=false;
            }
        }
    }

    static void insert(TrieNode root,String key){
        TrieNode insert=root;
        for(int i=0;i<key.length();i++) {
            int index=key.charAt(i)-'a';
            if (insert.children[index] == null) {
                insert.children[index] = new TrieNode();
            }
            insert = insert.children[index];
        }
        insert.isendofword=true;
    }
    public static boolean wordBreak(String s,TrieNode root) {
        boolean[] good = new boolean[s.length() + 1];
        good[0] = true;        // base case

        for (int i = 0; i < s.length(); i++)
        {
            if (good[i])
            {
                TrieNode node = root;
                for (int j = i; j < s.length(); j++)
                {
                    if (node == null) {
                        break;
                    }

                    node = node.children[s.charAt(j) - 'a'];

                    // we can make [0, i] using our known decomposition
                    // and [i+1, j] using this string in a Trie
                    if (node != null && node.isendofword) {
                        good[j + 1] = true;
                    }
                }
            }
        }

        // `good[n]` would be true if all characters of `s` can be segmented
        return good[s.length()];
    }
    public static void insertwords(List<String> wordDict,TrieNode root){
        for(int i=0;i<wordDict.size();i++){
            insert(root,wordDict.get(i));
        }
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        //You can code here
        TrieNode root=new TrieNode();
        insertwords(wordDict,root);
        return wordBreak(s,root);

    }

    public static void main(String[] args) {
        List<String> worddict=new ArrayList<>(Arrays.asList( "mobile", "samsung",  "sam",  "sung", "ma",
                "mango",  "icecream", "and",  "go",   "i",
                "like",   "ice",      "cream" ));
        System.out.println(wordBreak("ilikesamsung",worddict));

    }
}
