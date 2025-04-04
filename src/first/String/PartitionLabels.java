package first.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class PartitionLabels {

    public static List<Integer> partitionLabels(String s) {
        List<Integer> list=new ArrayList<>();
        int prev=-1;
        int maxi=0;
        HashMap<Character,Integer> lastindexmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            lastindexmap.put(s.charAt(i),i);
        }
        for(int i=0;i<s.length();i++){
            maxi=Math.max(lastindexmap.get(s.charAt(i)),maxi);
            if(maxi==i) {
                list.add(maxi - prev);
                prev = maxi;
            }
        }

        return list;
    }
    public static void main(String[] args) {
    String s="eccbbbbdec";
        System.out.println(partitionLabels(s));
    }
}
