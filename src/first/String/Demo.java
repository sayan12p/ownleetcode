package first.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {


    public static void main(String[] args) {
        String s="testis";
        for(int i=0;i<s.length();i++){
            String substr="";
            for(int j=i;j<s.length();j++){
                substr+=s.charAt(j);
                System.out.println(substr);
            }
        }
    }
}

