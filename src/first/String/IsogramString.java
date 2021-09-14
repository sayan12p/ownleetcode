package first.String;

import java.util.HashMap;
import java.util.Map;

public class IsogramString {
    public static boolean checkisomorhic(String s){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        if(map.values().stream().allMatch(i->i.intValue()==1)) return true;
        return false;
    }
    public static void main(String[] args) {
    String s="pene";
        System.out.println(checkisomorhic(s));
    }
}
