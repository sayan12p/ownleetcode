package Sort;

import javafx.util.Pair;

import java.util.*;

public class MaximumPerformance {
    //The performance of a team is the sum of their engineers' speeds multiplied by the minimum efficiency among their engineers.
    public static int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
    int modulo=(int)Math.pow(10,9)+7;
        List<Pair<Integer,Integer>> canditates=new ArrayList<>();
        for(int i=0;i<n;i++){
            canditates.add(new Pair<>((efficiency[i]),speed[i]));
        }
        //sort the candiates based on the efficiencies
        Collections.sort(canditates, Comparator.comparing(o -> -o.getKey()));
        PriorityQueue<Integer> speedheap=new PriorityQueue<>(((o1, o2) -> o1-o2));
        long speedSum=0,perf=0;
        for(Pair<Integer,Integer> p:canditates){
            Integer curefficiency=p.getKey();
            Integer curspeed=p.getValue();
            if(speedheap.size()>k-1){
                speedSum-=speedheap.remove();
            }
            speedheap.add(curspeed);
            speedSum+=curspeed;
            perf=Math.max(perf,speedSum*curefficiency);
        }
        return (int)(perf%modulo);
        }

    public static void main(String[] args) {
    int[] speed=new int[]{2,10,3,1,5,8};
    int[] efficiency=new int[]{5,4,3,9,7,2};
    int k=3,n=6;
        System.out.println(maxPerformance(n,speed,efficiency,k));
    }
}
