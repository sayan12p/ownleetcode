package first;

import java.util.ArrayList;
import java.util.List;

/*  l    r
t [1,2,3],
  [4,5,6],
b [7,8,9],*/
//jeta process hoe geche ota eekta com kore dite hbe..for eg t process hole t++ and r process hole r--
public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {

        int row=matrix.length;
        int col=matrix[0].length;
        List<Integer> list=new ArrayList<>();

        if(row==0) return list;
        int l=0,r=col-1,t=0,b=row-1,d=0;
        while(l <= r && t<=b ){
            if(d==0){
                for(int i=l;i<=r;i++){
                    list.add(matrix[t][i]);
                }
                d=1;
                t++;
            }else if(d==1){
                for(int i=t;i<=b;i++){
                    list.add(matrix[i][r]);
                }
                r--;
                d=2;
            }else if(d==2){
                for(int i=r;i>=l;i--){
                    list.add(matrix[b][i]);
                }
                d=3;b--;
            }else if(d==3){
                for(int i=b;i>=t;i--) {
                    list.add(matrix[i][l]);

                }
                d=0; l++;
            }

        }
        return list;
    }
    public static void main(String args[]){

        int[][] a={{ 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 }};
        List list=spiralOrder(a);
        System.out.println(list.toString());
    }
}
