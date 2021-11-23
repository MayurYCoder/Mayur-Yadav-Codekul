package Multithreading;

public class deadlock {
    public static void main(String[] args) {
        String resource1 = "Printer";
        String resource2 = "Scanner";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + "locked" + resource1);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + "locked" + resource2);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + "locked" + resource2);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + "locked" + resource1);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.setName("laptop");
        t2.setName("desktop");

        t1.start();
        t2.start();
    }
}
