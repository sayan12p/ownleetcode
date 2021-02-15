package first;

interface printable{
    int a=10;
    void print();
}
public class Interfacetest implements printable{

    public void print(){System.out.println("Hello");}

    public static void main(String args[]){
        Interfacetest obj = new Interfacetest();
        obj.print();

    }
}

