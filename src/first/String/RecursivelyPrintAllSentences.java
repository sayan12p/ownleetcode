package first.String;

import java.util.ArrayList;
import java.util.List;



public class RecursivelyPrintAllSentences {
    public static List<List<String>> printAllSentences(String[][] input) {

        boolean[] visited=new boolean[input.length];
        List<List<String>> result=new ArrayList<>();
            print(input, 0,new ArrayList<>(),result,visited);

        return null;
    }

    public static void print(String[][] words,int row,List<String>subset,List<List<String>> result,boolean[] visited){

        int R=words.length;int i=0;
        if(row==R){
            result.add(new ArrayList<>(subset));
           return;
        }
        for(;i<words[i].length;i++){
            if(words[row][i]!=""){
                subset.add(words[row][i]);
                print(words,row+1,subset,result,visited);
                subset.remove(subset.size()-1);
            }
            if(i==words[i].length-1) {
                subset.remove(subset.size()-1);
                i=0;
                row=row-1;
                visited[i]=true;
            }
          }


    }
    public static void main(String[] args) {
        String input[][]={{"you", "we"},
                {"have", "are"},
                {"sleep", "eat", "drink"}};
        printAllSentences(input);

    }
}
