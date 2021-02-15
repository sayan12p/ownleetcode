package first.String.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MessageTransfer {
    public static String convertMessage(String s) {
        String s1[] = s.replaceAll("WUB", " ").trim().split(" ");
        StringBuilder sb=new StringBuilder();
        for(String a:s1){
            if(a.length()>0)
           sb.append(a+" ");
        }
        sb.trimToSize();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();

            System.out.println(convertMessage(str));
        }
    }
}
