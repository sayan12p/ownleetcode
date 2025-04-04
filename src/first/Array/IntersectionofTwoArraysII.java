package first.Array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntersectionofTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {

      /*  ArrayList<Integer> numberlist=new ArrayList<Integer>(nums1.length);
        for(int num:nums1) numberlist.add(num);
        for(int num:nums2) numberlist.add(num);
      List<Integer> list=numberlist.stream()
              .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
              .entrySet()
              .stream()
              .filter(m->m.getValue()>1)
              .map(Map.Entry::getKey)
              .collect(Collectors.toList());*/
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int i=0,j=0,k=0;
      while(i<nums1.length && j<nums2.length){
          if(nums1[i]<nums2[j]){
              i++;
          }
          else if(nums1[i]>nums2[j]){
              j++;
          }else {
              nums1[k++]=nums1[i++];
              j++;
          }
      }
return Arrays.copyOfRange(nums1,0,k);
    }
    public static void main(String[] args) {
    int nums1[]={4,9,5};
    int nums2[]={9,4,6,8,4};
        System.out.println( Arrays.toString(intersect(nums1,nums2)));
    }
}
