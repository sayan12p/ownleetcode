package TwoPointers;

public class MissingNoInArray {
    public static int missingNo(int[] num){
        if(num.length==1){
            return num[0];
        }
        for(int i=0;i<num.length;i++){
            if((num[i+1]-num[i])!=1){
                return i+2;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,10};
        System.out.println(missingNo(arr));
    }
}
