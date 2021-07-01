package TwoPointers;

public class FindMajorityElement {
    //return the first index of the majority element
    public static void findmajorityelement(int[] arr){
        int res=0,count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[res]){
                count++;
            }else count--;
            if(count==0) {count=1;res=i;}
        }
        count=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[res] == arr[i]) {
                count++;
            }
        }
            if(count<=arr.length/2){
                System.out.println(-1);
            }
            else
                System.out.println(res);
        }

    public static void main(String[] args) {
        int[] arr=new int[]{20,30,40,50,50,50,50};
        findmajorityelement(arr);
    }
}
