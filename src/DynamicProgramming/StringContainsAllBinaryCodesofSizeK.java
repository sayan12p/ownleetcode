package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringContainsAllBinaryCodesofSizeK {

    public static boolean hasAllCodes(String s, int k) {
        //You can code here
        HashSet<String> list=new HashSet<>();
        for(int i=0;i+k<s.length();i++){
            String substr=s.substring(i,i+k);
            list.add(substr);
        }
        return (list.size()==Math.pow(2,k));
    }
    public static void main(String[] args) {
        String s="00110110";
        System.out.println(hasAllCodes(s,2));
    }
}
