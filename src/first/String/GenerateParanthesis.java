package first.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParanthesis {
    public static List<String> generateParanthesis(int n){
        List<String> result=new ArrayList<>();
        findAll("(",1,0,result,n);
        return result;
    }
    public static void findAll(String a,int o,int c,List<String> result,int n){
        if(a.length() ==2*n){
            result.add(a);
            return;
        }
        if(o<n) findAll(a+"(",o+1,c,result,n);
        if(c<o) findAll(a+")",o,c+1,result,n);
    }
    public static void main(String[] args) {
    List<String> result=generateParanthesis(2);
        System.out.println(result);
    }
}
