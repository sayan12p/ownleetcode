package first.String;

public class ReverseString {

    public static void reverseString(char[] s) {
        int len=s.length;
    for(int i=0;i<len/2;i++){
        swapchar(s,i,len-i-1);
    }
    }
    public static void swapchar(char[] s, int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
    public static void main(String[] args) {
        char[] s=new char[]{'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);

    }
}
