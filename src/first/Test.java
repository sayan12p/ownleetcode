package first;



import java.util.*;

public class Test {
    public static  String removechars(String str, String remove){
        char[] charstr=str.toCharArray();
        char[] charRemove=remove.toCharArray();
        int i,dst=0;
        boolean[] flags=new boolean[128];
        for( i=0;i<charRemove.length;i++){
            flags[charRemove[i]]=true;
        }
        for( i=0;i<str.length();i++){
            if(!flags[charstr[i]]){
                charstr[dst++]=charstr[i];
        }
    }
    return  new String(charstr,0,dst);
    }
    public static void main(String args[]) {
        String greeting = "Good Morning, Dave";
        String result=removechars(greeting,"Goo");
        System.out.println(result);

    }
}

