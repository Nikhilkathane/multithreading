package package1;

public class thread1 extends Thread {
    public void run() {
            for (int i = 0; i <= 10; i++)
            {
                Thread.yield();// give matured property to thread

                System.out.println("hellow");
            }
        }
}
