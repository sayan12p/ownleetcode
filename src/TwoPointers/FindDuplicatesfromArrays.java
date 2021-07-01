package TwoPointers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicatesfromArrays {
    public static int removeDuplicates(ArrayList<Integer> a) {
        List<Integer> result=a.stream().distinct().collect(Collectors.toList());
        return result.size();
    }
    public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(2);
        System.out.println(removeDuplicates(list));
    }
}
