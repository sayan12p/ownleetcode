import com.sun.deploy.util.ArrayUtil;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.util.concurrent.CompletableFuture;

 interface demo1 {
  default String hop(){
      return "hopping";
  }
  static int getctof(int ctemp){
      return ctemp*9;
  }

 }
public class demo2 implements demo1{


     /*String hop(){
         return "hop";
     }*/
     void go(){
         System.out.println(hop());
         System.out.println(demo1.getctof(100));
     }


    public static void main(String[] args) {
    new demo2().go();


    }


}