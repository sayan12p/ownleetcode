package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://www.youtube.com/watch?v=05y82cP3bJo&t=1361s
public class NQueens {
    public static void solveNQueens(int n) {
        String[][] chess=new String[n][n];
        printQueens(chess,"",0);
    }

    public static void printQueens(String[][]chess,String  qsf,int row){
        List<List<String>> finalresult=new ArrayList<>();
        if(row==chess.length){
            for(int i=0;i<chess.length;i++) {
                String[]result=new String[chess.length];
                result[0]=".";
                result[1]=".";
                result[2]=".";
                result[3]=".";
                String qsf1 = qsf.split(",")[i].substring(2,3);
                // System.out.println(qsf1);
                result[Integer.parseInt(qsf1)]="Q";
                finalresult.add(Arrays.asList(result));
            }
            System.out.println(finalresult.toString());
            return;
        }
        for(int col=0;col<chess.length;col++){
            /*if(isQueenSafe(chess,row,col)) */{
                chess[row][col] = "1";
                printQueens(chess, qsf + row + "-" + col + ",", row + 1);
                chess[row][col] = "0";
            }
        }
    }

    private static boolean isQueenSafe(String[][] chess, int row, int col) {
        for(int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]=="1") return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]=="1") return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
            if(chess[i][j]=="1") return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n=4;
        solveNQueens(n);
    }
}
