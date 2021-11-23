package Multithreading;

public class YieldDemo extends Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        YieldDemo yieldDemo=new YieldDemo();
        yieldDemo.start();


        for (int i=1;i<=5;i++){
            System.out.println("In Main Method");
        }

    }

    @Override
    public void run() {
        Thread.yield();
        for (int i=1;i<=5;i++){
            System.out.println("In Run");
        }
    }
}
