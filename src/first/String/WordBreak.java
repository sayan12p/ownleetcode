package first.String;

import java.util.*;

public class WordBreak {
    public static boolean wordBreak(String A,Set<String> dictionary) {
        //code here
        int size = A.length();

        // base case
        if (size == 0)
            return true;

        //else check for all words
        for (int i = 1; i <= size; i++)
        {
            // Now we will first divide the word into two parts ,
            // the prefix will have a length of i and check if it is
            // present in dictionary ,if yes then we will check for
            // suffix of length size-i recursively. if both prefix and
            // suffix are present the word is found in dictionary.

            if (dictionary.contains(A.substring(0,i)) &&
                    wordBreak(A.substring(i,size),dictionary))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] dict=new String[]{"i", "like", "sam",
                "sung", "samsung", "mobile",
                "ice", "cream", "icecream",
                "man", "go", "mango"};
        Set<String> dictionary=new HashSet<>();
        for(String s:dict){
            dictionary.add(s);
        }
        String A="isamlike5";
        System.out.println(wordBreak(A,dictionary));

    }
}
