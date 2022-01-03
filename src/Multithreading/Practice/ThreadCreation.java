package Multithreading.Practice;

public class ThreadCreation extends Thread{
    public void run(){
        System.out.println("Thread creation by thread class");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadCreation obj=new ThreadCreation();
        obj.start();
        Thread.sleep(100);
    }
}
