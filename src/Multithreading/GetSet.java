package Multithreading;

public class GetSet {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("MAyur");
        System.out.println(Thread.currentThread().getName());
    }
}
