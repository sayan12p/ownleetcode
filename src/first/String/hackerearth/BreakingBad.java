package first.String.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class BreakingBad {

    public static Map maxBalance(Map map){
        Set<Map.Entry<String,String>> set=map.entrySet();
        int count=0;int remc=0;
        Map<String,Integer> map1=new HashMap<>();
        for(Map.Entry<String,String> me:set){
            if(me.getValue().contains(",")){
                String value=me.getValue();
                for(int i=0;i<value.length();i++){
                    if (value.charAt(i)==',') count++;
                }if(count>=remc){
                    remc=count;
                    count=0;
                    map1.put(me.getKey(),remc);
                }

            }else continue;

        }
         return map1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int t = Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        Map<String,String> map=new HashMap<>();
        while (t-- > 0) {
            {while (m-->0){
                String name = sc.next();
              String balance=sc.next();
                map.put(name,balance);

        }
                Map map1=maxBalance(map);

            map1.forEach((k,v)-> System.out.println(k+" " +v));
    }
}
    }
}