package Multithreading;

public class SynchronizeBlock {
    static  int num;

    public static void increase(){
        synchronized (SynchronizeBlock.class){
            num++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizeBlock obj=new SynchronizeBlock();
        SynchronizeBlock obj1=new SynchronizeBlock();

        Thread t1=new Thread(()->{
            for (int i=1;i<=1000;i++){
                obj.increase();
            }
        }
        );
        Thread t2=new Thread(()->{
            for (int i=1;i<=1000;i++){
                obj.increase();
            }
        }
        );
        Thread t3=new Thread(()->{
            for (int i=1;i<=1000;i++){
                obj1.increase();
            }
        }
        );
        Thread t4=new Thread(()->{
            for (int i=1;i<=1000;i++){
                obj1.increase();
            }
        }
        );

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println("sum==>"+obj.num);
    }

}
