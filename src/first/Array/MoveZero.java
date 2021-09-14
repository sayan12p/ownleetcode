package first.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZero {
    public static int returnmaximumzeroes(int[] nums){
       int[] original= Arrays.copyOf(nums,nums.length);
        int counter[]=new int[nums.length];int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) counter[i]=0;
            int counter1=0;
            while (nums[i]%10==0){
                counter1++;
                nums[i]=nums[i]/10;
            }
            counter[i]=counter1;
        }
        List<Integer> collect = Arrays.stream(counter).boxed().collect(Collectors.toList());
        return original[collect.indexOf(collect.stream().max(Comparator.comparing(Integer::intValue)).get())];

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=br.read();
        int[] input=new int[num];
        for(int i=0;i<num;i++){
            input[i]=Integer.parseInt(br.readLine());
        }

        System.out.println(returnmaximumzeroes(input));
    }
}
