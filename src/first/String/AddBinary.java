package first.String;

import java.util.Arrays;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int a1=Integer.parseInt(a);
        int b1=Integer.parseInt(b);
        int i=0;int carry=0;
        int[] sum=new int[10];
        while (a1 != 0 || b1 != 0)
        {
            sum[i++] = (int)((a1 % 10 + b1 % 10 + carry) % 2);
            carry = (int)((a1 % 10 + b1 % 10 + carry) / 2);
            a1 = a1 / 10;
            b1 = b1 / 10;
        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        --i;
        int length=10-i;
        int[] result= Arrays.copyOfRange(sum, 0, length + 1);
        StringBuilder sb=new StringBuilder();
        char[] s=      Arrays.toString(result).toCharArray();
        String rev="";
        for(int j=s.length-1;j>=0;j--)
        rev+=s[j];


        return rev;
    }
    public static void main(String[] args) {
        String result=addBinary("11100","10101");
        System.out.println(result);
    }
}
