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
		
		int nums[]= new int[]{-2,0,1,3};
		System.out.print(threeSum(nums,2));
	}

public static List<List<Integer>> threeSum(int[] nums,int target) {
	
	List<List<Integer>> result=new ArrayList<>();
	Arrays.sort(nums);
	for(int i=0;i<nums.length-2;i++) {
		int j=i+1,k=nums.length-1;
		while(j<k) {
			if (nums[i] + nums[j] + nums[k] > target) k--;
			else if (nums[i] + nums[j] + nums[k] < target) {
				result.add(Arrays.asList(nums[i], nums[j], nums[k]));
				j++;
				k--;
			}
		}
		}
	result=result.stream().distinct().collect(Collectors.toList());
	return result;
    }
}


