package Multithreading;


/*1.set Daemon thread before starting of thread otherwise you will gwt exception.
  2.We cannot set the daemon thread to main method.


 */



public class DaemonThread extends Thread {
    public static void main(String[] args) {
        DaemonThread obj=new DaemonThread();
        obj.setDaemon(true);
        obj.start();
        System.out.println(obj.isDaemon());
        System.out.println("In main Method");
    }

    @Override
    public void run() {
        System.out.println("In run Method");
    }
}
