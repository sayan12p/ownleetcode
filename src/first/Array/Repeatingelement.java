package first.Array;

import java.util.Arrays;

public class Repeatingelement {

    public static  void findintersection(int[] a,int[] b,int[] temp,int m,int n){
        int i=0;int j=0;int k=0;
        while(i<m && j<n){
            if(a[i]<b[j]){
                i++;
            }else if(b[j]<a[i]){
                j++;
            }else if(a[i]==b[j]){
                temp[k++]=a[i];
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a=new int[]{1, 5, 5};
        int[] b=new int[]{3, 4, 5, 5, 10};
        int[] c=new int[]{5,5,10,10};
        int[] temp=new int[a.length+b.length];
        findintersection(a,b,temp,a.length,b.length);
        int[] result=new int[temp.length+c.length];
        findintersection(temp,c,result,temp.length,c.length);
        System.out.println(Arrays.toString(result));
    }
}
