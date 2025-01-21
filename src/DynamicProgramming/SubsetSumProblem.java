package DynamicProgramming;

public class SubsetSumProblem {

    public static Boolean isSubsetSum(int arr[], int sum){
        // You can code here
        int n=arr.length;
        return find(n-1, sum,arr);
    }

    public static boolean find(int index,int sum,int[] arr){
        if(sum==0) return true;
        if(index==0) return arr[index]==sum;
        boolean nottaken=find(index-1,sum,arr);
        boolean taken=false;
        if(arr[index]<=sum){
            taken=find(index-1,sum-arr[index],arr);
        }
        return nottaken|| taken;
    }
    public static void main(String[] args) {
    int[] arr=new int[]{3, 34, 4, 12, 5, 1};
        System.out.println(isSubsetSum(arr,35));
    }
}
