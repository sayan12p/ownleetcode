import first.Third;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Test3 {


    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("D://ownleetcode//src/country.txt");
        BufferedReader br = new BufferedReader(in);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

}



