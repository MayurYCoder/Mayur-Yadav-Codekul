package Multithreading;
/*priority-  Max=10
             Normal=5(default)
             Min=1
 *  Priority of the daemon thread is always low but we can set th epriority

 */
public class ThreadPriority {
    public static void main(String[] args) {
        A obj=new A();
        B obj1=new B();

        obj.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(Thread.MIN_PRIORITY);
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
}
