package first.Array;

import java.util.HashMap;

public class MaximumGoodArraySum {

    public static long getmaxsubarraySum(int[] nums,int k){
        HashMap<Integer,Long> map=new HashMap<>();long ans=Integer.MIN_VALUE;
        int n=nums.length; long s=0;
       map.put(nums[0],0l);
        for(int i=0;i<n;i++){
            s+=nums[i];
            if(map.containsKey(nums[i]-k)){
                ans=Math.max(ans,s- map.get(nums[i]-k));
            }
            if(map.containsKey(nums[i]+k)){
                ans=Math.max(ans,s- map.get(nums[i]+k));
            }
            if (i + 1 < n && (!map.containsKey(nums[i + 1]) || map.get(nums[i + 1]) > s)) {
                map.put(nums[i + 1], s);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    int[] a=new int[]{1,2,3,4,5,6};
        System.out.println(getmaxsubarraySum(a,1));
    }
}
