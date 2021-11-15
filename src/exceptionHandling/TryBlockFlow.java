package exceptionHandling;
/*
    if Exception occur then directly compiler throw in the catch block.
    if Exception not occur then try block fully executed.
 */
public class TryBlockFlow {
    public static void main(String[] args) {
        int a=100,b=0;
        try {
            System.out.println("1");

            int c=a/b;
            System.out.println("2");
        }catch (ArithmeticException e){
            System.out.println("3");
            System.out.println(e);
        }
        System.out.println("4");

    }
}
