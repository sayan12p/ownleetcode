import java.util.Arrays;
import java.util.HashMap;



public class Test1 {

    public static void sort(int i,int j,int[] nums) {
        if (i < j) {
            int mid = (i + j) / 2;
            sort(0, mid, nums);
            sort(mid+1, j, nums);
            merge(i, mid, j, nums);
        }
    }

    public static void merge(int start,int mid,int end,int[] nums){
        int n1=mid-start+1;
        int n2=end-mid;
        int[] n1array=new int[n1];
        int[] n2array=new int[n2];
        for(int i=0;i<n1;i++){
            n1array[i]=nums[start+i];
        }
        for(int j=0;j<n2;j++){
            n2array[j]=nums[mid+1+j];
        }

        int k=start; int i=0;int j=0;
            while(i<n1 && j<n2){
                if(n1array[i]<=n2array[j]){
                    nums[k++]=n1array[i++];
                }else {
                    nums[k++]=n2array[j++];
                }
            }
            while(i<n1){
                nums[k]=n1array[i];
                i++;
                k++;
            }
            while(j<n2){
                nums[k]=n2array[j];
                j++;
                k++;
            }
    }
    public static void main(String[] args) {

int[] nums=new int[]{6,2,3,8};
        sort(0,nums.length-1,nums);
        System.out.println(Arrays.toString(nums));
    }
}
