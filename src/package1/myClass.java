package package1;

public class myClass {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        t1.start();
        thread2 t2=new thread2();
        Thread t3=new Thread(t2);
        t3.start();

    }
}
