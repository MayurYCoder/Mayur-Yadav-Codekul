package Multithreading;

public class BookTheaterSeat {
    int TotalSeats = 10;

    synchronized void  bookseat(int seat) {
        if (TotalSeats >= seat) {
            System.out.println(seat+" seat booking sucessful");
            TotalSeats = TotalSeats - seat;
            System.out.println("Remainig seats are:" + TotalSeats);
        } else {
            System.out.println("seats cannot be booked");
            System.out.println("seats left:" + TotalSeats);
        }
    }
}
class MovieBookApp extends Thread{
    int seats;
    static BookTheaterSeat b;
    @Override
    public  void run() {
        b.bookseat(seats);
    }

    public static void main(String[] args) {
        b=new BookTheaterSeat();

        MovieBookApp obj=new MovieBookApp();
        obj.seats=6;
        obj.start();

        MovieBookApp obj1=new MovieBookApp();
        obj1.seats=5;
        obj1.start();
    }
}