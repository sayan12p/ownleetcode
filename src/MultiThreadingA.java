import java.util.LinkedList;

class Hello {

    static boolean flag = true;

    public void printArun() throws InterruptedException {
        String name = Thread.currentThread().getName();
            synchronized (this) {
//                System.out.println("hello arun " + name);
                for(int i=0;i<10;i++)
                if(i%2==0) System.out.println("value "+ i);
                flag = !flag;
                wait();
                notify();
            }
    }

    public void printSayan() throws InterruptedException {
        String name = Thread.currentThread().getName();
            synchronized (this) {
                //System.out.println("hello sayan " + name);
                for(int i=0;i<10;i++)
                if(i%2!=0) System.out.println("value "+ i);
                flag = !flag;
                notify();
                wait();
            }
    }
}
public class MultiThreadingA {
    public static void main(String[] args) throws InterruptedException {
        Hello h=new Hello();
        Thread t1=new Thread(()-> {
            try {
                h.printArun();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2=new Thread(()-> {
            try {
                h.printSayan();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }
}
