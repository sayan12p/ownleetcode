package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("lALL");
        list.add("AFN");
        list.add("ARS");
        list.add("AWG");
        list.add("AUD");
        list.add("AZN");
        list.add("BSD");
        list.add("BBD");
        list.add("BYN");
        list.add("BZD");
        boolean result = list.stream().anyMatch(s -> s.equalsIgnoreCase("USD"));
        System.out.println(result);

    }
}
