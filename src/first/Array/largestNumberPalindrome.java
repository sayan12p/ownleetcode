package first.Array;

import java.util.Arrays;

public class largestNumberPalindrome {
    public static boolean isPalindrome(int n){
        int divisor=1;
        while(n/divisor>=10)
            divisor=divisor*10;
            while (n != 0) {
            int leading=n/divisor;
            int trailing=n%10;
            if(leading!=trailing) return  false;
            n=(n%divisor)/10;
            divisor=divisor/100;
            }

        return true;
    }
    public static int checkPalindrome(int[] array){
        Arrays.sort(array);
        for(int i=array.length-1;i>=0;i--){
            if(isPalindrome(array[i]))
                return array[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array={1, 232, 54545, 999991 };
        System.out.println(checkPalindrome(array));
    }
}
