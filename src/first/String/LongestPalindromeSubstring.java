package first.String;

public class LongestPalindromeSubstring {
    static int resultStart;
    static int resultLength;
    public static String longestPalindrome(String s) {

        int slength=s.length();
        if(s.length()<2){
            return s;
        }
        //to check if each character is a center in a substring which is a possible palindrome
        for(int start=0;start<slength;start++){
           expandaroundcenter(s,start,start) ;
           expandaroundcenter(s,start,start+1);// if the length is even then the midpoint consists of 2 characters which is why it is start and start+1
        }
        return s.substring(resultStart,resultLength+resultStart);
    }
    public static void expandaroundcenter(String s,int start,int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;// starting at the middle and looping outwards.
            end++;
        }
        if(resultLength<end-start-1){
            resultStart=start+1;
            resultLength=end-start-1;
        }
    }

    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
}
