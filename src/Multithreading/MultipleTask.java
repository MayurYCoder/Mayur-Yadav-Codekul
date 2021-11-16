package Multithreading;

public class MultipleTask extends Thread{
    @Override
    public void run() {
        System.out.println("In task 1");
    }
}
class MultipleTask1 extends Thread{
    @Override
    public void run() {
        System.out.println("In task 2");
    }

    public static void main(String[] args) {
        MultipleTask Thread1=new MultipleTask();
        Thread1.start();

        MultipleTask1 Thread2=new MultipleTask1();
        Thread2.start();
    }
}
