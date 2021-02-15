package DepthFirstSearch;


import java.util.*;
/*
                        2
                    /       \             \
                  a         b               c
                 / /\          /\\           /\\
                ad ae af      bd be bf      cd ce cf

Concept of deque///
                Deque [] (start)
                Deque a b c(end)
                Deque a b c (start)  3
                Deque b c  ------Deque b c ad ae af
                Deque c ad ae af   -------Deque c ad ae af bd be bf
                Deque ad ae af bd be bf ----Deque ad ae af bd be bf cd ce cf
 */

public class PhoneNumber {
    public static List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if(digits.length()==0) return list;
        HashMap<String,String> map=new HashMap<>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        Deque<String>deque=new ArrayDeque<>();
        deque.add("");
        for(int i=0;i<digits.length();i++){
            String d=digits.substring(i,i+1);
            String from=map.get(d);
            int n=deque.size();
            for(int j=0;j<n;j++){
                String pull=deque.pollFirst();
                for(int k=0;k<from.length();k++){
                    String temp=pull.concat(from.charAt(k)+"");
                    deque.add(temp);
                }
            }
        }
        while (!deque.isEmpty()){
            list.add(deque.poll());
        }
        return list;
    }
    public static void main(String[] args) {
    String digits="23";
        System.out.println(letterCombinations(digits).toString());
    }
}
