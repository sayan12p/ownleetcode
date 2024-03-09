package first.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RollNos {

    public static  int getrollnumbers(Integer[] rollnos) {

        List<Integer> originallist = Arrays.stream(rollnos).collect(Collectors.toList());
        int n = rollnos.length;
        int c=0;
        while (true) {
            boolean flag = true;
            for (int i = 0; i < originallist.size()-1; i++) {
                if (originallist.get(i) < originallist.get(i + 1)) {
                    flag = false;
                    originallist.remove(i+1);
                }
            }
            if(flag){
                break;
            }else{
                c++;
            }

        }
        return c-1;
    }
    public static void main(String[] args) {
        Integer[] rollnos=new Integer[]{6,5,8,4,7,10,9};
        System.out.println(getrollnumbers(rollnos));
    }
}
