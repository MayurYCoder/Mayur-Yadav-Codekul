package Multithreading;

public class BookTheater {
    static int totalSeats = 20;
    int seats;

    synchronized static void bookSeats(int seats) {
        if (totalSeats >= seats) {
            System.out.println(seats + "Seats booking sucessfully done");
            totalSeats = totalSeats - seats;
            System.out.println(totalSeats + "seats are remaining");
        } else {
            System.out.println("Seats are not booked");
            System.out.println(seats + "seats are available");
        }
    }
}
class MyThread1 extends Thread{
    BookTheater b;
    int seats;
    MyThread1(BookTheater b,int seats){
        this.b=b;
        this.seats=seats;
    }
    @Override
    public void run() {
        b.bookSeats(seats);
    }
}
class MyThread2 extends Thread{
    BookTheater b;
    int seats;
    MyThread2(BookTheater b,int seats){
        this.b=b;
        this.seats=seats;
    }

    @Override
    public void run() {
        b.bookSeats(seats);
    }
}
class Mytheater{
    public static void main(String[] args) {
        BookTheater bookTheater=new BookTheater();
        MyThread1 t1=new MyThread1(bookTheater,7);
        t1.start();

        MyThread2 t2=new MyThread2(bookTheater,6);
        t2.start();

        BookTheater bookTheater1=new BookTheater();
        MyThread1 t3=new MyThread1(bookTheater1,5);
        t3.start();

        MyThread2 t4=new MyThread2(bookTheater1,9);
        t4.start();
    }
}

