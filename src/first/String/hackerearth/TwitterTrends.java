package first.String.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class TwitterTrends {
    private static HashMap<String,Integer> HashTagCntMap = new HashMap<>();
    public static String returnTrends(String s){
        String s1[]=s.split(" ");
        for(String a:s1){
            if(a.contains("#")){
                if(HashTagCntMap.containsKey(a))
                    HashTagCntMap.put(a,HashTagCntMap.get(a)+1);
                else
                    HashTagCntMap.put(a,1);
            }
        }
        return "";
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();

            System.out.println(returnTrends(str));
        }
    }
}
