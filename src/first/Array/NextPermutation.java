package first.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        ArrayList<Integer> numslist=new ArrayList<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        int index=-1;
        for(int i=numslist.size()-2;i>=0;i-- ){
            if(numslist.get(i)<numslist.get(i+1)){
                index=i;
            }
        }
        if(index==-1) Collections.reverse(numslist);
        for(int i=numslist.size()-1;i>=index;i--){
          if(numslist.get(i)>numslist.get(index)){
              int temp=numslist.get(i);
              numslist.set(i,numslist.get(index));
              numslist.set(index,temp);
              break;
          }
        }
        List<Integer> sublist=numslist.subList(index+1,numslist.size());
        Collections.reverse(sublist);
        nums=numslist.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String args[]){
        int nums[]={1,1,5};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
