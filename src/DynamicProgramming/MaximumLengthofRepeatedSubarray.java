package DynamicProgramming;
//https://www.youtube.com/watch?v=Im4Hejcr-SE&t=533s
public class MaximumLengthofRepeatedSubarray {

    public static int findLength(int[] A, int[] B) {
        //You can code here
        int Alength=A.length;
        int Blength=B.length;
        int[][] dp= new int[Alength+1][Blength+1];
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<Alength;i++){
            dp[0][i]=0;
        }
        for(int j=0;j<Blength;j++){
            dp[j][0]=0;
        }
        for(int i=1;i<=Alength;i++){
            for(int j=1;j<=Blength;j++ ){
                if(A[i-1]==B[j-1]) {
                    dp[i][j]=1+dp[i-1][j-1];
                    ans=Math.max(dp[i][j],ans);
                }
                else {
                    dp[i][j]=0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums1={1,2,3,2,1};
        int[] nums2={3,2,1,4,7};
        System.out.println(findLength(nums1,nums2));
    }
}
