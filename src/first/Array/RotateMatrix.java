package first.Array;

import java.util.Arrays;

public class RotateMatrix {
    public static void rotate(int [][] matrix){

        int n=matrix.length;
        //finding the transpose of a matrix
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        ///two pointer approach to swap the beginning and the ending elements of one column till it reaches the middle
        for(int i=0;i<n;i++){
            for(int j=0;j<(n/2);j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
    public static void main(String args[]) {
    int matrix[][]={{5, 1, 9, 11},{2, 4, 8, 10},{13, 3, 6, 7},{15, 14, 12, 16}};
    rotate(matrix);
    for(int[]a:matrix){
        for(int i:a)
            System.out.print(i+" ");
    }
    }
}
