package Multithreading;

public class multithreadingDemo extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("hii");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Hello implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<=5;i++) {
            System.out.println("hello");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        multithreadingDemo obj=new multithreadingDemo();
        obj.start();



        Hello obj2=new Hello();
        Thread t1=new Thread(obj2);
        t1.start();
    }
}
