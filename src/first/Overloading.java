package first;

public class Overloading {
    public int add(int x,int y){
        return x+y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }

    public static void main(String[] args) {
        Overloading r=new Overloading();
        System.out.println(r.add(20,30));
        System.out.println(r.add(20,30,40));

    }
}
