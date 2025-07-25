package first.Array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumSwaps {

    public static int minswaps(int[] nums){
        Map<Integer, Integer> collect =new HashMap<>();
        int n=nums.length;
        collect=IntStream.range(0,nums.length).boxed().collect(Collectors.toMap(i->nums[i],Function.identity()));
        //collect=collect.entrySet().stream().sorted((e1,e2)->e1.getKey()-e2.getKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        Arrays.sort(nums);
        System.out.println(collect);
        int ans=0; int noofswaps=0;
        boolean[] visited=new boolean[n];
        Arrays.fill(visited,false);
        for(int i=0;i<n;i++){
            if(visited[i] || collect.get(nums[i])==i) continue;
            int j=i;
            while(!visited[j]){
                visited[j]=true;
                noofswaps++;
                j=collect.get(nums[j]);
            }
            ans+=noofswaps-1;
            noofswaps=0;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,5,4,3,2};
        int[] nums1=new int[]{4,3,2,1};
        System.out.println(minswaps(nums1));
    }
}
