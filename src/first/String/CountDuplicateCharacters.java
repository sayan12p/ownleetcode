package first.String;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountDuplicateCharacters {
    public static void main(String[] args) {
        printCountOfDuplicateCharJava8Stream("bbbcccccddddddaaaa");
        // printCountOfDuplicateCharJava8Stream("##^$!%^$!^%@!$^@!kds");

    }

    // Using hashmap : print count of each character in a given string.
    private static void printCountOfDuplicateCharJava8Stream(String input) {

        // Step 1
        IntStream intStream = input.chars();

        // Step 2

        Stream<Character> charsStream = intStream.mapToObj(ch -> (char) ch);
        /* Step 3 */
       Map<Character, Long> output = charsStream.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        charsStream.forEach(character -> {System.out.println(character);});

    }
}
