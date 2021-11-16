package Multithreading;

public class ABChallange  {
    public int no;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        System.out.println(no);
        this.no = no;
    }
}
class C implements Runnable {
    @Override
    public void run() {
        while (true){
            System.out.println();
        }

    }
}
class D implements Runnable{
    @Override
    public void run() {

    }
}
class main{
    public static void main(String[] args) {
        ABChallange t1=new ABChallange();
        t1.setNo(10);

        C obj=new C();
        Thread t2=new Thread(obj);
        t2.start();



    }
}
