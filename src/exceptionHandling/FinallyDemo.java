package exceptionHandling;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=10;
            int c=a/b;
            System.out.println(c);
        }/*
        catch (ArithmeticException e){
            System.out.println(e);
        }*/
        finally {
            System.out.println("i am in finally block");
        }
        System.out.println("i am here");
    }
}
