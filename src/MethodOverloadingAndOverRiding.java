class A {
    void foo(String a) /*throws Exception */{ /*throw new Exception();*/
        System.out.println(a);}
}
class SubB2 extends A {
    void foo(String b) { System.out.println("i"+b); }
}
public class MethodOverloadingAndOverRiding {
    public static void main(String[] args) {
       A a=new SubB2();

       a.foo("hello");
    }
}
