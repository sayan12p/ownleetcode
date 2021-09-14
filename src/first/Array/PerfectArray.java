package first.Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class PerfectArray {
    public static boolean perfectArray(int[] nums){
        int[] original=Arrays.copyOfRange(nums,0,nums.length); boolean flag=false;
        Arrays.sort(nums);
        if(!Arrays.toString(nums).equalsIgnoreCase(Arrays.toString(original))) {
            flag=true;
        }else return false;
        Map<Integer,Long> frequency=Arrays.stream(original).boxed().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
        Collection<Long> values = frequency.values();
        for(Long l:values){
            if(l.longValue()<2) flag=true; else return false;
        }
        for(int i:original){
            if(i<=original.length) flag=true; else return false;
        }
        return flag;
    }
    public static void main(String[] args) {
       int [] nums=new int[]{1,4,4,2};
        System.out.println(perfectArray(nums));
    }
}
