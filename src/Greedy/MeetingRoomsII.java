package Greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public static int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> mergedintervals=new PriorityQueue<>();
        for(int[] interval:intervals){
            if(mergedintervals.isEmpty()){
                mergedintervals.add(interval[1]);
                continue;
            }
            if(mergedintervals.peek()<=interval[0]){//same room
                mergedintervals.remove();
            }
            mergedintervals.add(interval[1]);
        }
        return mergedintervals.size();
    }
    public static void main(String[] args) {
    int[][] intervals={{0,30},{5,10},{15,20}};
        System.out.println(minMeetingRooms(intervals));
    }
}
