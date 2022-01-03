package Multithreading;

public class InterruptDemo extends Thread {
    public void run() {
        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("++"+e);
        }

    }

    public static void main(String[] args) {
        InterruptDemo obj=new InterruptDemo();
        obj.start();
        obj.interrupt();
    }
}
