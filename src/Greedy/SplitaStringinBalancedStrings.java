package Greedy;

public class SplitaStringinBalancedStrings {
    public static int balancedStringSplit(String s) {
        char ch[]=s.toCharArray();

       int balance=0; int result=0;
    for(int i=0;i<ch.length;i++){
        if(ch[i]=='L') {
            balance++;
        }else
            balance--;
        if(balance==0) result=result+1;

    }
    return result;
    }
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        System.out.println(balancedStringSplit(s));
    }
}
