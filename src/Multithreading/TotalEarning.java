package Multithreading;

public class TotalEarning extends Thread {
    int Total=0;
    @Override
    public synchronized void run() {
        for (int i=1;i<=10;i++){
            Total=Total+100;
           // System.out.println(Total);
        }
        notify();
    }


    public static void main(String[] args) {
        TotalEarning T1=new TotalEarning();
        T1.start();
        synchronized (T1){
            try {
                T1.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total Earning :"+T1.Total+"Rs");
    }
}
