package exceptionHandling;
/*
1. Only checked exceptions will be propogated, unchecked exceptions will not propogated.
*/
public class ExceptionPropogation {
    public void a(){
        int i=10;
        int j=i/0;
        System.out.println(i);
    }
    public void b(){
        a();
    }
    public void c(){
        try {
            b();
        }catch (ArithmeticException e){
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        ExceptionPropogation obj=new ExceptionPropogation();
        obj.c();
    }
}
