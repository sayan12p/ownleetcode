package first.Array;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static first.Array.SortColors.swap;

public class Minimumswaps2 {

    static int minimumSwaps(int[] arr) {
        Map<Integer,Integer> map= IntStream.range(0,arr.length).boxed().collect(Collectors.toMap(i->arr[i], Function.identity()));
        int noofswap=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                int index=map.get(i+1);
                map.put(arr[i],index+1);
                swap(arr,i,i+1);
                noofswap++;
            }
        }
        return noofswap;
    }
    public static void main(String[] args) {
        int[] a=new int[]{4,3,2,1};
        System.out.println(minimumSwaps(a));
    }
}
