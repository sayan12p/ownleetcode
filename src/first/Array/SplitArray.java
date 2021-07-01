package first.Array;

public class SplitArray {
    //binarysearch
    public static int splitArray(int[] nums, int m) {
    int l=0;
    int r=Integer.MAX_VALUE;
    while(l<r){
        int mid=(l+r)/2;
        if(ok(mid,nums,m)){
            r=mid;
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
        int[] nums={1,2,3,4,5};
        int m=2;
        System.out.println(splitArray(nums,m));
    }
}
