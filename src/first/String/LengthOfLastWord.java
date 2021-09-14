package first.String;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {

        String[] strings=s.split(" ");
      int length=strings[strings.length-1].length();
return length;
    }
    public static void main(String[] args) {
       String str1="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(str1));
    }
}
