package first.String;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestDuplicateSubstring {

    public static String longestDupSubstring(String s) {
        int n = s.length();
        Map<Character, List<Integer>> indicesmap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            indicesmap.computeIfAbsent(s.charAt(i), k -> new ArrayList<>()).add(i);
        }
        System.out.println(indicesmap);
        int maxlen = 0;
        int index = -1;// starting positionn of the substring
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            List<Integer> hash = indicesmap.get(cur);
            if (Objects.nonNull(hash) && hash.size() > 0) hash
                    .remove(0);
            if (hash != null) {
                for (int it : hash) {
                    int j = 0;
                    while (i + j < n && it + j < n && s.charAt(i+j) == s.charAt(it+j)) {
                        j++;
                    }
                    if (j > maxlen) {
                        maxlen = j;
                        index = i;
                    }
                    if (maxlen == n - i - 1) {
                        return s.substring(index, index + maxlen);
                    }
                }
            }
        }
        return maxlen == 0 ? "" : s.substring(index, index + maxlen);
    }

    public static void main(String[] args) {
        String s="banana";
        System.out.println(longestDupSubstring(s));
    }
}
