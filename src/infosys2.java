public class infosys2 {
    private static boolean checkPalindrome(int n){
        int original=n;
        int rem=0;
        int rev=0;int sum=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        sum=original+rev;
       return isPalindrome(sum);
    }
    public static  boolean isPalindrome(int n){
     int divisor=1;
     while(n/divisor>=10){
         divisor=divisor*10;
     }
     while(n!=0){
         int leading=n/divisor;
         int trailing=n%10;
         if(leading!=trailing) return false;
         n=(n%divisor)/10;
         divisor=divisor/100;
     }
     return true;
    }
    public static void main(String[] args) {
    int n=124;
        System.out.println(checkPalindrome(n));
    }
}
