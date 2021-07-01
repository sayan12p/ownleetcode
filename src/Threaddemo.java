import java.util.Scanner;

class Infosys implements Runnable{
    static int number=1;
    public int printnumbers=10;
    private int remainder;
    static Object lock=new Object();

    public Infosys(int remainder) {
        this.remainder = remainder;
    }

    @Override
    public void run() {
        while(number<printnumbers-1){
            synchronized (lock){
                if(number%3!=remainder) {
                    try {
                        lock.wait(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+" "+number);
                number++;
                lock.notifyAll();
            }
        }
    }
}
public class Threaddemo {
    public static void main(String[] args) {
        Infosys i1=new Infosys(1);
        Infosys i2=new Infosys(1);
        Infosys i3=new Infosys(0);
        Thread t1=new Thread(i1,"T1");
        Thread t2=new Thread(i1,"T2");
        Thread t3=new Thread(i1,"T3");
        t1.start();
        t2.start();
        t3.start();
    }
}