package first.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SortColour {
	
	public static void main(String args[]) {
		System.out.print("hello");
		
		int nums[]= new int[]{-1,0,1,2,-1,-4};
		System.out.print(threeSum(nums));
	}

public static List<List<Integer>> threeSum(int[] nums) {
	
	List<List<Integer>> result=new ArrayList<>();
	Arrays.sort(nums);
	for(int i=0;i<nums.length-2;i++) {
		int j=i+1,k=nums.length-1;
		while(j<k) {
			if(nums[i]+nums[j]+nums[k]>0) k--;
			else if(nums[i]+nums[j]+nums[k]<0) j++;
			else {
				result.add(Arrays.asList(nums[i],nums[j],nums[k]));
				j++;
				k--;
			}
		}
	}
	result=result.stream().distinct().collect(Collectors.toList());
	return result;
    }
}


