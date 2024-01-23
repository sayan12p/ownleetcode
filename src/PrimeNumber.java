import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

    public static boolean isprime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,11));
        for(int i=0;i<list.size();i++){
            if(isprime(list.get(i))){
                System.out.println(list.get(i) +" is a prime number");
            }else{
                System.out.println(list.get(i) +" is not a prime number");
            }
        }
    }
}
