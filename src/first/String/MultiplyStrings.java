package first.String;

import java.util.Arrays;

public class MultiplyStrings {
    /*when you have a char, like '3', in order to get the integer, which is the offset, you need to minus '0'; when you have a integer, like 2, in order to get the char, you need to add the offset, which means, you should plus '0'.
    */public static String multiply(String num1, String num2) {
        /*char[] chas1=num1.toCharArray();
        char[] chas2=num2.toCharArray();*/
        int m=num1.length();
        int n=num2.length();
        int[] result=new int[n+m];
        Arrays.fill(result,0);
        for(int j=n-1;j>=0;j--){
            for(int i=m-1;i>=0;i--){
                int product=(num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                int temp=result[i+j+1] + product;
                result[i+j+1]=(temp%10);
                result[i+j]=(result[i+j]+temp/10);
            }
        }
        StringBuilder sb=new StringBuilder();
        boolean seen=false;
        for (int s:result){
            if(s==0 && !seen) continue;
            sb.append(s);
            seen=true;
        }
        return sb.length()==0? "0":sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(multiply("123","456"));
    }
}
