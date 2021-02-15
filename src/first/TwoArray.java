package first;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoArray {

public static String exist(char[][] board, String word) {
	
	StringBuilder sb=new StringBuilder(word);
	/*sb.*/
	Map<Character,Integer> map=new HashMap<>();
	
	for (int row = 0; row < board.length; row++) 
		for (int col = 0; col < board[row].length; col++) {
	
			char  c=board[row][col];
			for(int i=0;i<sb.length();i++)
			if((sb.charAt(i))==c) {
				if(map.get(c)== null)
				map.put(c, 1);
							
				else
					map.put(c,  (map.get(c)+1));
			
			}			
	}
	for(Map.Entry<Character,Integer> entry:map.entrySet())
		System.out.println("Key="+entry.getKey() + "Value=" + entry.getValue());

		
     return sb.toString();   
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner sc=new Scanner(System.in);
		char [][] a = {
				{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}
		};
		String word="ABCCED";
		String result=exist(a,word);
		//int n=sc.nextInt();
		System.out.println(result);
	}

}
