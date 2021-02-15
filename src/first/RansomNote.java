package first;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {

    public static void checkMagazine(String[] magazine,String[] note) {
        Map<String,Integer> magazinewords=new HashMap<>();
        for (String word:magazine){
            if(magazinewords.containsKey(word)){
                int count =magazinewords.get(word);
                magazinewords.put(word,count+1);
            }
            else{
                magazinewords.put(word,1);
            }
        }
        for(String word:note){
            if(magazinewords.containsKey(word)){
                int count=magazinewords.get(word);
                if(count<=0){
                    System.out.println("NO");
                    return;
                }
                  magazinewords.put(word,count-1);
            }
            else if(!magazinewords.containsKey(word)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
    }

