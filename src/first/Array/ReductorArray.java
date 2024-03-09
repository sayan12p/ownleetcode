package first.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReductorArray {
    public static int checkMin(int[] array1, int[] array2, int d) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        List<Integer> result = new ArrayList<>();
        int count = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < array1.length; i++) {
            for (int j = 1; j < array2.length; j++) {
                min = Math.abs(array1[i] - array2[j]);
                if (min >= d) {
                    result.add(min);
                }
            }
           count=result.size();
        }
        return count;
    }



    public static void main(String[] args) {
        int[] array1={1,2,3};
        int[] array2={4,5,6};
        System.out.println(checkMin(array1,array2,2));
    }
}
