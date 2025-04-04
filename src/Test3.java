import first.Third;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Test3 {


    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("D://ownleetcode//src/country.txt");
        BufferedReader br = new BufferedReader(in);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);

            String s= line;
            LinkedHashMap<Character, Long> collect = s.chars().mapToObj((c) -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
            System.out.println(collect);
        }
    }

}



