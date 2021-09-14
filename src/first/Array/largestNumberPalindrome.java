package first.Array;

import java.util.Arrays;

public class largestNumberPalindrome {
    public static boolean isPalindrome(int n){
        int originalNum = n;
        int reversedNum=0;
        int remainder=0;
        // get the reverse of originalNum
        // store it in variable
        while (n != 0) {
            remainder = n % 10;
            reversedNum = reversedNum * 10 + remainder;
            n /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            return true;
        }
        else return false;
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
