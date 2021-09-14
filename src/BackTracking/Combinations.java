package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        boolean[] visited=new boolean[n];
        backtrack(result,visited,new ArrayList<>(),1,k,n);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, boolean[] visited, ArrayList<Integer> subset,int start, int k, int n) {
        if(k==1 && n==1){
            subset.add(1);
            return;
        }
        else if(subset.size()==k){

                result.add(new ArrayList<Integer>(subset));
            return;
        }
        for(int i=start;i<=n;i++){
            if(visited[i-1]==true) continue;
            subset.add(i);
            visited[i-1]=true;
            backtrack(result,visited,subset,start++,k,n);
            subset.remove(subset.size()-1);
            visited[i-1]=false;
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4,2).toString());
    }
}
