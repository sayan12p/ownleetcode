package DynamicProgramming;

import java.util.Arrays;

public class MinimumFallingPathSum {

    public static int minFallingPathSum(int n, int[][] matrix) {
        //You can code here
    int rows=matrix.length;
    int cols=matrix[0].length;
    int[][] dp=new int[rows+1][cols+1];
    for(int[] a: dp)
        Arrays.fill(a,Integer.MAX_VALUE);
    int ans=Integer.MAX_VALUE;
    for(int c=0;c<cols;c++){
        ans=Math.min(ans,minFallingPathSumhelper(rows-1,c,matrix,dp));
    }
    return ans;
    }

    private static int minFallingPathSumhelper(int row, int col,int[][] matrix, int[][] dp) {
        if(row==0 && col<matrix[0].length && col>=0) return matrix[row][col];
        if(col>=matrix[0].length || col<0) return Integer.MAX_VALUE;
        if(dp[row][col] != Integer.MAX_VALUE) return dp[row][col];
        return dp[row][col]= matrix[row][col]+ Math.min(Math.min(minFallingPathSumhelper(row-1,col+1,matrix,dp),
                minFallingPathSumhelper(row-1,col,matrix,dp)), minFallingPathSumhelper(row-1,col-1,matrix,dp));

    }

    public static void main(String[] args) {
    int[][] matrix=new int[][]{{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(minFallingPathSum(3,matrix));
    }
}
