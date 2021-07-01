package TwoPointers;

public class findRepeatingElement {
    public static void findRepeatingElement(int[] arr,int n){
        int slow=arr[0]+1;
        int fast=arr[0]+1;
        do{
            slow=arr[slow]+1;
            fast=arr[arr[fast]+1]+1;
        }
        while(slow!=fast);
        slow=arr[0]+1;
        while (slow!=fast){
            slow=arr[slow]+1;
            fast=arr[fast]+1;
        }
        System.out.println(slow-1);
    }
    public static void main(String[] args) {
        int[] array=new int[]{0,1,2,4,6,7,2};
        findRepeatingElement(array,7);
    }
}
