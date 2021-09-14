package first.String;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;


public class IsomorphicStrings1 {
    public static boolean areIsomorphic(String str1, String str2)
    {
        int m = str1.length();
        int n = str2.length();

        // Length of both strings must be same for one to one
        // corresponance
        if(m != n)
            return false;

        // To mark visited characters in str2
        Boolean[] marked = new Boolean[256];
        Arrays.fill(marked, Boolean.FALSE);

        // To store mapping of every character from str1 to
        // that of str2. Initialize all entries of map as -1.
        int[] map = new int[256];
        Arrays.fill(map, -1);

        // Process all characters one by one
        for (int i = 0; i < n; i++)
        {
            // If current character of str1 is seen first
            // time in it.
            if (map[str1.charAt(i)] == -1)
            {
                // If current character of str2 is already
                // seen, one to one mapping not possible
                if (marked[str2.charAt(i)] == true)
                    return false;

                // Mark current character of str2 as visited
                marked[str2.charAt(i)] = true;

                // Store mapping of current characters
                map[str1.charAt(i)] = str2.charAt(i);
            }

            // If this is not first appearance of current
            // character in str1, then check if previous
            // appearance mapped to same character of str2
            else if (map[str1.charAt(i)] != str2.charAt(i))
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String s1="rfkqyuqf";String s3="foo";
        String s4="bar";
        String s2="jkxyqvnr";
        System.out.println(areIsomorphic(s1,s2));
    }
}
