package first;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Solution {
	static BufferedReader br;
	static PrintWriter pr;
	static StringTokenizer st;
	 public static int lengthOfLongestSubstring(String s) {
		 int n = s.length(); 
		    int res = 0; // result 
		    for (int i = 0; i < n; i++) 
		        for (int j = i; j < n; j++) 
		            if (areDistinct(s, i, j)) 
		                res = Math.max(res, j - i + 1); 
		    return res;  
	    }
	private static boolean areDistinct(String s, int i, int j) {
		// TODO Auto-generated method stub
		boolean visited[]=new boolean[26];
		char s1[]=s.toCharArray();
		for (int k = i; k <= j; k++) { 
	        if (visited[s1[k] - 'a'] == true) 
	            return false; 
	        visited[s1[k] - 'a'] = true; 
	    } 
	    return true; 
		
	}
	public static void main (String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pr = new PrintWriter(new OutputStreamWriter(System.out));
		String input=br.readLine();
		System.out.print(lengthOfLongestSubstring(input));
		//br = new BufferedReader(new FileReader("in.txt"));
		//pr = new PrintWriter(new FileWriter("out.txt"));
		
		

}
}