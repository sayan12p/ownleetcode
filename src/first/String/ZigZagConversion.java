package first.String;

import java.util.ArrayList;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        if(numRows==1) return s;
        ArrayList<StringBuilder> rows=new ArrayList<>();
        for(int i=0;i<Math.min(numRows,s.length());i++){
            rows.add(new StringBuilder());
        }
        boolean goingdown=false;
        int curRow=0;
        //for reading characters row wise and adding that to that row list
        for(char c:s.toCharArray()){
            rows.get(curRow).append(c);
            if(curRow==0|| curRow==numRows-1) goingdown=!goingdown;
            curRow+=goingdown?1:-1;
        }
        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }


    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        System.out.println(convert(s,3));
    }
}
