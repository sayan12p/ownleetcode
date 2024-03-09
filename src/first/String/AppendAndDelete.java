package first.String;

public class AppendAndDelete {

    public static String appenddelete(String s,String t,int k){
    int i=0;int j=0;
    while(i<s.length() && j<t.length()){
        if(s.charAt(i)==t.charAt(j)){
            i++;
            j++;
        }
        else break;
    }
    int noofoperations=s.length()-i+t.length()-j;
    if(k<noofoperations) return "No";
    if((k-noofoperations)%2!=0) return "No";
    return "Yes";
    }
    public static void main(String[] args) {
        String s="aba";
        String t="aba";
        int k=9;
        System.out.println(appenddelete(s,t,7));
    }
}
