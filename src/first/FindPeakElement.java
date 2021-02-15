package first;

public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int result=0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int first = nums[i - 1];//1
                int num = nums[i];
                int second = nums[j];//3
                if (findpeak(first, num, second)) {
                    result=i;
                    break;
                }
            }
        }
        return result;
    }
    public static boolean findpeak(int f,int n,int s){
        if(n>f && n>s)
        return true;
        return false;
    }
    public static void main(String[] args) {
    int[] nums={1,2,3,1};
        System.out.println(findPeakElement(nums));
    }
}
