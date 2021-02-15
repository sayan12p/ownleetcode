package first;

import java.util.Arrays;

public class RemoveElement {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
  public static void main(String args[]){
      int a[]=new int[]{0,0,0,1,1,2,2};
      int result=removeDuplicates(a);
      for(int i=0;i<result;i++)
          System.out.print(a[i]);


  }
}
