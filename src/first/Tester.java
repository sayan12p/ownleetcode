package first;

public class Tester {
    int i,j;
    public static String truncateFromLeft(String theString, int sizelimit) {
        if ((theString != null) && (theString.length() > 0)) {
            if (theString.length() <= sizelimit)
                return theString;
            return theString.substring(theString.length() - sizelimit, theString.length());
        }
        return theString;
    }

   public int show (int i){
        return 1;
   }
   public double show(double j){
       return 3.0;
   }
}
 class B {
    public static void main(String args[])  {
    Tester t=new Tester();
    int a=t.show(3);
    double b= t.show(3.0);
        System.out.println(a+b);
    }
}