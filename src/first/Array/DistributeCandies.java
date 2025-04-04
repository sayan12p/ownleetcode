package first.Array;

import java.util.Arrays;

public class DistributeCandies {
    public static int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);int n=candyType.length;
        int count=1;
        for(int i=0;i<n-1;i++){
            if(candyType[i]!=candyType[i+1]){
                continue;
            }else {
                count++;
            }
        }
        int total=n/2;
        if(count<=total){
            return count;
        }
        return total;
    }
    public static void main(String[] args) {
       int[] candytype=new int[]{1,1,2,2,3,3};
        System.out.println(distributeCandies(candytype));
    }
}
