package first.String;

import java.util.Arrays;

public class MakeStringAntiPalindrome {

    public static String makePalindrome(String s){
    char[] c=s.toCharArray();
        Arrays.sort(c);
        int n=s.length();
        int m=n/2;
        if(c[m]==c[m-1]){
            int i=m;
            while(c[i-1]==c[i] && i<n){
               i++;
            }
            for(int j=m;j<n && c[j]==c[n-j-1];++i,++j){
                if(i>=n) {
                    return "-1";
                }
                char t=c[i];
                c[i]=c[j];
                c[j]=t;
            }

        }
        return new String(c);
    }
    public static void main(String[] args) {
        String s="cccd";
        System.out.println(makePalindrome(s));
    }
}
