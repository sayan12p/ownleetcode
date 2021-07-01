package Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CaseSpecificSortingOfStrings {
    public static void caseSort(String str)
    {
        StringBuilder stringBuilder=new StringBuilder(str);
        ArrayList<Character> lowercase=new ArrayList<>();
        ArrayList<Character> uppercase=new ArrayList<>();
        for(int i=0;i<str.length();i++){
           if(Character.isLowerCase(str.charAt(i))){
               lowercase.add(str.charAt(i));
            }
            else if(Character.isUpperCase(str.charAt(i))){
               uppercase.add(str.charAt(i));
            }
        }
        List<Character> lowercasesorted=lowercase.stream().sorted().collect(Collectors.toList());
        List<Character> uppercasesorted=uppercase.stream().sorted().collect(Collectors.toList());
        int j=0,z=0;
        for(int i=0;i<str.length();i++) {
            char toreplace = str.charAt(i);
            if (Character.isLowerCase(toreplace)) {
               while(j<lowercasesorted.size()) {
                   stringBuilder.setCharAt(i,lowercasesorted.get(j));
                   j++;
                   break;
               }
            }
        }
        for(int i=0;i<str.length();i++) {
            char toreplace = str.charAt(i);
            if (Character.isUpperCase(toreplace)) {
                while(z<lowercasesorted.size()) {
                    stringBuilder.setCharAt(i,uppercasesorted.get(z));
                    z++;
                    break;
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }
    public static void main(String[] args) {
    String s="defRTSersUXI";
    caseSort(s);
    }
}
