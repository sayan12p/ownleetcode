package first.String.codingninjas;

public class nextLargestPalindrome {
    public static String nextLargestPalindrome(String number, int length) {
        int n=Integer.parseInt(number);
        boolean flag=false;
        while(n++<Integer.MAX_VALUE){
            flag=isPalindrome(Integer.toString(n),Integer.toString(n).length())?true:false;
            if(flag) return Integer.toString(n);
        }
        return null;
    }
    public static boolean isPalindrome(String number,int length){
        String reversedString="";
        for(int i=length-1;i>=0;i--){
            reversedString=reversedString+number.charAt(i);
        }
        if(number.equalsIgnoreCase(reversedString)) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(nextLargestPalindrome("1221",4));
    }
}
