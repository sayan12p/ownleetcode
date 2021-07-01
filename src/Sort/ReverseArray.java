package Sort;

public class ReverseArray {
    public static int reversePairs(int[] nums) {
        return mergesort_and_count(nums, 0, nums.length - 1);
    }

    private static int mergesort_and_count(int[] nums, int start, int end) {
        if(start<end){
            int mid=(start+end)/2;
            int count=mergesort_and_count(nums,start,mid)+mergesort_and_count(nums,mid+1,end);
            int j=mid+1;
            for(int i=start;i<=mid;i++) {
                while (j <= end && nums[i] > nums[j] *2) {
                    j++;
                }
                count += j - (mid + 1);
            }
            merge(nums,start,mid,end);
            return count;
            }
            else return 0;

        }

    public static void merge(int[] nums, int start, int mid, int end) {
        int l=mid-start+1;
        int r=end-mid;
        int arrayleft[]=new int[l];
        int arrayright[]=new int[r];
        for(int i=0;i<l;i++){
            arrayleft[i]=nums[start+i];
    }
    for(int j=0;j<r;j++){
            arrayright[j]=nums[mid+1+j];
    }
    int i=0,j=0;
        for(int k=start;k<=end;k++){
            if(j>=r||(i<l && arrayleft[i]<=arrayright[j])){
                nums[k]=arrayleft[i++];
            }else{
                nums[k]=arrayright[j++];
            }
        }

}

    public static void main(String[] args) {
    int nums[]={1,3,2,3,1};
        System.out.println(reversePairs(nums));
    }
}
