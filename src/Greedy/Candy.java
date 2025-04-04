package Greedy;

public class Candy {

    public static int candy(int[] ratings) {
    int n=ratings.length;
    int[] arr=new int[n];int result=n;
    for(int i=1;i<n;i++){
        if(ratings[i]>ratings[i-1]){
            arr[i]=arr[i-1]+1;
        }
    }
    for(int i=n-2;i>=0;i--){
        if(ratings[i]>=ratings[i+1]){
            arr[i]=Math.max(arr[i+1]+1,arr[i]);
        }
    }
    for(int i=0;i<n;i++){
        result+=arr[i];
    }
    return result;
    }
    public static void main(String[] args) {
    int[] ratings =new int[]{1,0,2};
        System.out.println(candy(ratings));
    }
}
