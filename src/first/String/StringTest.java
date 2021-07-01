package first.String;

public class StringTest {
    public static void main(String[] args) {
        String s1="JA";
        String s2="VA";
        String s3=s1+s2;
        String s4="JAVA";
        String s5="JA"+"VA";
        System.out.println(s3.equals(s4));//true
        System.out.println(s4.equals(s5));//true
        System.out.println(s3==s4);//false
        System.out.println(s4==s5);//false
    }
}
