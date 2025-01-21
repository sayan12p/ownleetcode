package geeksforgeeks.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindMajorityElement {
    public static int majorityElement(int a[], int size){
        HashMap<Integer,Integer> frequencymap=new HashMap<>();
        int result=0;
        for(int i=0;i<size;i++) {
        if (frequencymap.containsKey(a[i])) {
            frequencymap.put(a[i], frequencymap.get(a[i]) + 1);
        } else frequencymap.put(a[i], 1);
    }
        for(Map.Entry<Integer,Integer> mapentry:frequencymap.entrySet()){
        if(mapentry.getValue()>(size/2)){
            result=mapentry.getKey();
        }
        else result=-1;
    }
        return result;
}
    public static void main(String[] args) {
    int[] nums=new int[]{3,1,3,3,2};
        System.out.println(majorityElement(nums,5));
    }
}
