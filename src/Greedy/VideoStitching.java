package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VideoStitching {

    public static int videoStitching(int[][] clips, int time) {
    List<Pair> list=new ArrayList<>();
    for(int[] clip:clips){
        list.add(new Pair(clip[0],clip[1]));
    }
        Collections.sort(list,(a,b)->a.start-b.start);
        int minclips=0; int currentend=0; int n=list.size();
        int index=0;
        while(currentend<time){
            minclips++;
            int farthestend=currentend;
            while(index<n && list.get(index).start<=currentend ){
                farthestend=Math.max(farthestend,list.get(index).end);
                index++;
            }
            if(farthestend<=currentend){
                return -1;
            }
            currentend=farthestend;
        }
        return minclips;
    }

    public static class Pair{
        int start;
        int end;
        Pair(int start,int end){
            this.start=start;
            this.end=end;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
    public static void main(String[] args) {
        int[][] clips =new int[][]{{0,2},{4,6},{8,10},{1,9},{1,5},{5,9}};
        System.out.println(videoStitching(clips,10));
    }
}
