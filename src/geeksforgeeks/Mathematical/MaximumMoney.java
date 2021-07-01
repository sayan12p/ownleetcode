package geeksforgeeks.Mathematical;

public class MaximumMoney {
    public static int maximizeMoney(int N , int K) {
        // code here
        int result=0;
        for(int i=1;i<=N;i++){
            if(i%2==1){
                result+=K;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maximizeMoney(4,10));
    }
}
