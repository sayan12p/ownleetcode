package DepthFirstSearch;

import java.util.*;

public class WordLadder2 {
    public static ArrayList<String> findLadders(String beginWord, String endWord, List<String> wordList) {
        ArrayList<String> resultlist=new ArrayList<>();
        resultlist.add(beginWord);
        Deque<String> deque=new ArrayDeque<>();
        deque.push(beginWord);
        int wordsize=beginWord.length();
        Set<String> wordset=new HashSet<>();
        for(String s:wordList){
            wordset.add(s);
        }
        if(!wordset.contains(endWord)) return null;

        while(!deque.isEmpty()){
            String s=deque.peekFirst();
            char[] sb=s.toCharArray();
            deque.pop();
            for(int j=0;j<wordsize;j++){
                char oldChar = sb[j];
                for(char ch='a';ch<'z';ch++){
                    sb[j]=ch;

                }

            }

        }

        return resultlist;
    }
    public static void main(String[] args) {
        System.out.println(findLadders("hit","cog",new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"))).toString());
    }
}
