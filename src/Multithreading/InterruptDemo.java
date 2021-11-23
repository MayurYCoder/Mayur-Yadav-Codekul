package Multithreading;

public class InterruptDemo extends Thread {
    @Override
    public void run() {
        //System.out.println(Thread.interrupted());         //If we comment this line then exception will occur otherwise not.
        System.out.println(Thread.currentThread().isInterrupted());

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(500);
                //System.out.println(Thread.interrupted());

            }
        } catch (InterruptedException e) {
            System.out.println("Thread interupted"+e);

        }

    }

    public static void main(String[] args) {
        InterruptDemo T1 = new InterruptDemo();
        T1.start();
        T1.interrupt();
    }
}
