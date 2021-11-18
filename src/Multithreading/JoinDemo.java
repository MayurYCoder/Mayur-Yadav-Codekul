package Multithreading;

public class JoinDemo extends Thread {
    static Thread mainthread;
    @Override
    public void run() {
        try {
            mainthread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        for (int i=1;i<=5;i++){
            System.out.println("Chiled thread:"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)  {

        mainthread=Thread.currentThread();

        JoinDemo T1=new JoinDemo();
        T1.start();
 /*       try {
            T1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 */

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Thread:" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
                e.printStackTrace();
            }



    }
}
