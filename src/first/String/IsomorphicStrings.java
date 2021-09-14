package first.String;

public class IsomorphicStrings {
    public static boolean areIsomorphic(String str1, String str2)
    {
        char[] char1=str1.toCharArray();
        char[] char2=str2.toCharArray();
        boolean flag=false;
        char[] count1=new char[26];
        char[] count2=new char[26];
       int index=0;int sum1 = 0;int sum2=0;
        for(int i=0;i<char1.length;i++) {
           char c=char1[i];
           count1[c-'a']++;
        }
        for(int i=0;i<char2.length;i++) {
            int  c=char2[i];
            count2[c-'a']++;
        }
       for(int a:count1){
            sum1+=a;
       }
        for(int a:count2){
            sum2+=a;
        }
        return (sum1==sum2)?true:false;
        }
    public static void main(String[] args) {
        String s1="rfkqyuqf";
        String s2="jkxyqvnr";
        System.out.println(areIsomorphic(s1,s2));
    }
}
