package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveElementFromArray {
    public static int removeElement(
            ArrayList<Integer> a, int b) {
        Iterator<Integer> itr=a.iterator();
        while(itr.hasNext()){
             Integer x=itr.next();
             if (x==b){
                 itr.remove();
             }
    }
    return a.size();
    }
    public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,2,4,2,6,2));
        System.out.println(removeElement(list,2));
    }
}
