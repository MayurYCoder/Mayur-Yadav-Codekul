package Multithreading;
/*priority-  Max=10
             Normal=5(default)
             Min=1
 *  Priority of the daemon thread is always low but we can set th epriority
*/

public class ThreadPriority extends Thread{
  /*  public static void main(String[] args) {
     // System.out.println(Thread.currentThread().getPriority());
        A obj=new A();
        B obj1=new B();

        obj.setPriority(6);
        obj1.setPriority(5);

        System.out.println(obj.getPriority());
        System.out.println(obj1.getPriority());
        obj.start();
        obj1.start();

    }
}
class A extends Thread{
    @Override
    public void run() {
        System.out.println("In A class");
    }
}
class B extends Thread{
    @Override
    public void run() {
        System.out.println("In B class");
    }
}*/

    public static void main(String[] args) {
        ThreadPriority T1=new ThreadPriority();
        ThreadPriority T2=new ThreadPriority();
        ThreadPriority T3=new ThreadPriority();

        T1.setPriority(Thread.MAX_PRIORITY);
        T2.setPriority(Thread.MIN_PRIORITY);
        T3.setPriority(Thread.NORM_PRIORITY);

        T1.setName("1st Thread");
        T2.setName("2nd Thread");
        T3.setName("3rd Thread");

        T1.start();
        T2.start();
        T3.start();

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"Priority"+Thread.currentThread().getPriority());
    }
}





















