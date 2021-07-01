package BackTracking;

import java.util.ArrayList;

public class PermutationsString {
    public  static ArrayList<ArrayList<Character>> permute(String s){
        //code here
        ArrayList<ArrayList<Character>> result=new ArrayList<>();
        boolean visited[] =new boolean[s.length()];
        backtrack(result,visited,s,new ArrayList<>());
    return result;
    }

    private static void backtrack(ArrayList<ArrayList<Character>> result, boolean[] visited, String s,ArrayList<Character> subset) {

        if(s.length()==1) {
            subset.add(s.charAt(0));
            result.add(subset);
            return;
        }
        if(s==null) {
            result.add(subset);
            return;
        }
        if(subset.size()==s.length()){
            result.add(new ArrayList<>(subset));
            return;
        }
        for(int i=0;i<s.length();i++) {
            if (visited[i] == true) continue;
            subset.add(s.charAt(i));
            visited[i] = true;
            backtrack(result, visited, s, subset);
            subset.remove(subset.size() - 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        String names="ABC";
        System.out.println(permute(names).toString());
    }
    }

