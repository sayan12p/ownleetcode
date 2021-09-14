package first.Array;

public class SplitArray {
    //binarysearch
    public static int splitArray(int[] nums, int m) {
        int l=0;
        int r=0;
        for(int i=0;i<nums.length;i++){
            r+=nums[i];
            if(l<nums[i]){
                l=nums[i];
            }
        }

    while(l<=r){
        int mid=(l+r)/2;
        if(ok(mid,nums,m)){
            //r=mid;
            r=mid-1;
        }
        else{
            l=mid+1;
        }
    }
    return l;
    }

    private static boolean ok(int mid, int[] nums, int m) {
        int totalsum=0;
        int no_ofsubarrays=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>mid) return false;
            if(totalsum+nums[i]<=mid){
                totalsum=totalsum+nums[i];
            }else{
                no_ofsubarrays++;
                totalsum=nums[i];
            }
        }
        no_ofsubarrays++;
        return no_ofsubarrays<=m;
    }

    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int m=2;
        System.out.println(splitArray(nums,m));
    }
}
