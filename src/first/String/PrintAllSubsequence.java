package first.String;

public class PrintAllSubsequence {
    static void printrecurrsion(String t,int i,int n,String s){
        if (i==n) System.out.println(t);
        else {
            printrecurrsion(t,i+1,n,s);
            t=t+s.charAt(i);
            printrecurrsion(t,i+1,n,s);
        }
    }
    public static void main(String[] args) {
    String s="abc";
    printrecurrsion("",0,3,s);
    }
}
