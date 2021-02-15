package first.String.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LoveForPalindromes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();

            int n = str.length();

            int p = 0;
            boolean flag = false;
            for (int i = 1; i < n - 1; i++) {
                if (str.charAt(i + 1) == str.charAt(p) || str.charAt(p) == str.charAt(i)) {
                    System.out.println("0");
                    flag = true;
                    break;
                }
                p = i;
            }
            if (flag)
                continue;
            Map<Character,Integer> map=new HashMap<>();
            int ans=Integer.MAX_VALUE;
            for(int i=0;i<n;i++) {
                int a=0;
                if (map.containsKey(str.charAt(i))){
                    a=map.get(str.charAt(i));
                    ans=Math.min(ans,i-a-1);
                }
                map.put(str.charAt(i),i);
            }

                System.out.println(ans);
        }
    }
}

