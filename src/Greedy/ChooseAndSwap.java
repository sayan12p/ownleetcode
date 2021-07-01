package Greedy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ChooseAndSwap {
    public static String chooseandswap(String A){
        Set<Character> choose=new HashSet<>();
        for(int i=0;i<A.length();i++){
            choose.add(A.charAt(i));
        }
        Iterator<Character> itr=choose.iterator();
        for(int i=0;i<A.length();i++){
            if(choose.contains(A.charAt(i))){
                choose.remove(A.charAt(i));
            }
            if(choose.isEmpty()) break;
            Character ch=choose.stream().findFirst().get();
            if(ch<A.charAt(i)){
                char ch2=A.charAt(i);
                for(int j=0;j<A.length();j++){
                    String toreplace=Character.toString(A.charAt(j));
                    if(A.charAt(j)==ch) {
                        A=A.replace(A.charAt(j),ch2);
                    }
                    if(A.charAt(j)==ch2) {
                        A=A.replace(A.charAt(j),ch);
                    }
                }
                break;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        String s="ccad";
        System.out.println(chooseandswap(s));
    }
}
