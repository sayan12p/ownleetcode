package first.String.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Candies {
    public static int calculateMaximum(int[] input,int x){
        Arrays.sort(input);
        int count=0;
        int k=0;
        while (k<x && input[k]<=0){
            count=count+input[k];
            k++;

        }
        return Math.abs(count);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);

        int t = Integer.parseInt(br.readLine());
        int x = sc.nextInt();
        int a[] =new int[t];
        for(int i=0;i<t;i++)
            a[i]=sc.nextInt();

            System.out.println(calculateMaximum(a,x));

    }
}
