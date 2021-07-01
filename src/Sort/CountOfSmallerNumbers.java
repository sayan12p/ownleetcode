package Sort;

import java.util.ArrayList;
import java.util.List;

public class CountOfSmallerNumbers {
    public static List<Integer> countSmaller(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int indices[]=new int[n];
        for(int i=0;i<n;i++){
            indices[i]=i;
        }
        mergeSort(indices,0,n,result,nums);
        List<Integer> resultoreturn=new ArrayList<>(n);
        for(int i:result){
            resultoreturn.add(i);
        }
            return resultoreturn;

    }
    public static void mergeSort(int[] indices,int left,int right,int[] result,int[] nums){
        if(right-left<=1){
            return;
        }
        int mid=(left+right)/2;
        mergeSort(indices,left,mid,result,nums);
        mergeSort(indices,mid,right,result,nums);
        merge(indices,left,right,mid,result,nums);
    }

    public static void merge(int[] indices, int left, int right, int mid,int[] result, int[] nums) {
        // merge [left, mid) and [mid, right)
        int i = left; // current index for the left array
        int j = mid; // current index for the right array
        // use temp to temporarily store sorted array
        List<Integer> temp = new ArrayList<Integer>(right - left);
        while (i < mid && j < right) {
            if (nums[indices[i]] <= nums[indices[j]]) {
                // j - mid numbers jump to the left side of indices[i]
                result[indices[i]] += j - mid;
                temp.add(indices[i]);
                i++;
            } else {
                temp.add(indices[j]);
                j++;
            }
        }
        // when one of the subarrays is empty
        while (i < mid) {
            // j - mid numbers jump to the left side of indices[i]
            result[indices[i]] += j - mid;
            temp.add(indices[i]);
            i++;
        }
        while (j < right) {
            temp.add(indices[j]);
            j++;
        }
        // restore from temp
        for (int k = left; k < right; k++) {
            indices[k] = temp.get(k - left);
        }
    }

    public static void main(String[] args) {
    int nums[]=new int[]{5,2,6,1};
        System.out.println(countSmaller(nums));
    }
}
