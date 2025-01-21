package Greedy;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumberofTapstoOpentoWateraGarden {
    public static int minTaps(int n, int[] ranges) {
        List<VideoStitching.Pair> taprange=new ArrayList<>();

    for(int i=0;i<n+1;i++){
        int start=i-ranges[i];
        int end=i+ranges[i];
        taprange.add(new VideoStitching.Pair(start,end));
    }
    taprange.sort((c1,c2)->c1.start-c2.start);
        System.out.println(taprange);
    int i=0;int count=0;int end=0;int maxwater=0;
    while(end<n){
        count+=1;
        while(i+1<n && taprange.get(i).start<=end){
            maxwater=Math.max(maxwater,taprange.get(i).end);
            i++;
        }
        if(maxwater==end){
            return -1;
        }else end=maxwater;
    }
    return count;
    }
    public static void main(String[] args) {
       int[] ranges= {0,0,0,0};
        System.out.println(minTaps(3,ranges));
    }
}
