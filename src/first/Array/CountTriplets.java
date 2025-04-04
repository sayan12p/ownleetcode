package first.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//https://www.youtube.com/watch?v=tBFZMaWP0W8
/* If m no of elements are there to the left of a and n no of elements are there to the right of a then the total no of combinations that can be formed is m*n
1,3,9 with indices 0,1,3
1,3,9 with indices 0,1,4
1,3,9 with indices 0,1,4
 */
public class CountTriplets {
    public static long countTriplets(List<Long> arr,long r){
        Map<Long,Long> leftMap=new HashMap<>();
        Map<Long,Long> rightMap=new HashMap<>();
        for(long item:arr){
            rightMap.put(item,rightMap.getOrDefault(item,0L)+1);//to generate the frequency
        }
        long count=0;
        for(int i=0;i<arr.size();i++){
            long mid=arr.get(i);//getting the value of a
            long c1=0,c3=0;
            rightMap.put(mid,rightMap.getOrDefault(mid,0L)-1);
            if(leftMap.containsKey(mid/r) && mid%r==0){
                c1=leftMap.get(mid/r);

            }
            if(rightMap.containsKey(mid*r)){
                c3=rightMap.get(mid*r);
            }
            count+=c1*c3;
            leftMap.put(mid,leftMap.getOrDefault(mid,0L)+1);
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(nr[0]);
//
//        long r = Long.parseLong(nr[1]);
//
//        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        List<Long> arr = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            long arrItem = Long.parseLong(arrItems[i]);
//            arr.add(arrItem);
//        }
            List<Long> arr= Arrays.asList(1L,4L,16L,64L);int r=4;
        long ans = countTriplets(arr, r);
        System.out.println(ans);

    }
}
