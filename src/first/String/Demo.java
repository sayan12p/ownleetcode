package first.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static Map<Character,Integer> findoccurrence(String s){

        char[] str=s.toCharArray();
        int length=str.length;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<length;i++){
            if(!map.containsKey(str[i])){
                map.put(str[i],1);

            }else
                map.put(str[i],map.get(str[i])+1);

        }
        return map;

    }
    public static void main(String[] args) {
          String s="aabbcc";
          Map map=findoccurrence(s);
          Set<Map.Entry<Character,Integer>> set=map.entrySet();
          for(Map.Entry<Character,Integer> me:set){
              System.out.println(me.getKey()+ " "+ me.getValue());
          }
    }
}
