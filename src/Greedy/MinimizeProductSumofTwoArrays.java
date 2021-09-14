package Greedy;

import java.util.PriorityQueue;

public class MinimizeProductSumofTwoArrays {
    public static int minProductSum(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> p1=new PriorityQueue<>((a,b)->(a-b));
        PriorityQueue<Integer> p2=new PriorityQueue<>((a,b)->(b-a));
        for(int i:nums1){
            p1.add(i);
        }
        for(int i:nums2){
            p2.add(i);
        }
        int result=0;
        while(!p1.isEmpty() && !p2.isEmpty()){
            result+=p1.poll()*p2.poll();
        }
        return result;
    }

    public static void main(String[] args) {
    int nums1[]={5,3,4,2};
    int nums2[]={4,2,2,5};
        System.out.println(minProductSum(nums1,nums2));
    }
}
