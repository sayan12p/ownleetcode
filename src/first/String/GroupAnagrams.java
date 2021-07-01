package first.String;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams
{
    public static List<String> groupAnagrams(String[] strs) {
        HashMap<String,String> anagram=new HashMap<>();
        List<String> result=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[] chars=strs[i].toCharArray();
            String s=Arrays.toString(chars);
            Arrays.sort(chars);
            if(!anagram.containsKey(Arrays.toString(chars))){
              anagram.put(Arrays.toString(chars),s);
            }else{
                StringBuilder sb=new StringBuilder(anagram.get(Arrays.toString(chars)));
                sb.append(s);
                anagram.put(Arrays.toString(chars),sb.toString());
            }
           result= anagram.values().stream().collect(Collectors.toList());

        }
        return result;
    }
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs).toString());
    }
}
