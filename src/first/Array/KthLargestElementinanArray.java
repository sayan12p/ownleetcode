package first.Array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementinanArray {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pr=new PriorityQueue<>(Comparator.comparing(Integer::intValue,(i1,i2)->-i1.compareTo(i2)));
        int x=0;
        for(int i:nums) {
            pr.add(i);
        }
        while(!pr.isEmpty() && k-->0){
           x= pr.poll();
        }
        return x;
    }
    public static void main(String[] args) {
    int[] nums=new int[]{3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));
    }
}
