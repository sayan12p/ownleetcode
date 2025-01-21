package DynamicProgramming;

public class Isubsequence {

    public static boolean isSubsequence(String s, String t) {
        //You can code here
        int i=0; int j=0;
        while(j<t.length()){
            if(i==s.length()) return true;
            else if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i==s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","abefgc"));
    }
}
