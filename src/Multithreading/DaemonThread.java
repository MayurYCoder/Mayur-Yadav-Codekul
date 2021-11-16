package Multithreading;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println("In child thread");
        System.out.println(Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        System.out.println("In main thread");

        DaemonThread t=new DaemonThread();
        t.setDaemon(true);
       // System.out.println(t.isDaemon());
        t.start();
    }
}
