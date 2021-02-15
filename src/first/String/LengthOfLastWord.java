package first.String;

public class LengthOfLastWord {
   /* public static int lengthOfLastWord(String s) {
        int length=s.length(); int result=0;
        while(length>=0){
            if(s.charAt(--length) !=' ') result++;
            else if(result>0) return result;
        }
            return result;
        if(s==" ") return 0;
        String result[]=s.split(" ");
        int a=result.length;
        int length=result[a-1].length();
        return s.length()==0 ? 0:length;
    }
    public static void main(String[] args) {
        String s=" ";
        System.out.println(lengthOfLastWord(s));
    }*/
}
