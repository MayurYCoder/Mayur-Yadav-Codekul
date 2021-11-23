package Multithreading;

public class SynchronizeDemo {
    int num;
    public synchronized void increase(){
   /*     synchronized (this){
            num++;
        }
    */
        num++;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizeDemo obj=new SynchronizeDemo();
        Thread T1=new Thread(()->{
            for (int i=1;i<=1000;i++){
                obj.increase();
            }
        });
        Thread T2=new Thread(()->{
            for (int i=1;i<=1000;i++){
                obj.increase();
            }
        }
        );

        T1.start();
        T2.start();

        T1.join();
        T2.join();
        System.out.println("num is==>"+obj.num);
    }
}
