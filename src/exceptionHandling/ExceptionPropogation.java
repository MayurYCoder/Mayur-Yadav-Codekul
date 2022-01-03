package exceptionHandling;
/*
1. Only checked exceptions will be propogated, unchecked exceptions will not propogated.
*/
public class ExceptionPropogation {
    public static void a() {
        int i = 10;
        int j=i/0;
    }
    public  static void b(){
        a();
    }
    public static void c(){
        b();
    }

    public static void main(String[] args) {
        ExceptionPropogation obj=new ExceptionPropogation();
        try{
            c();
        }catch(Exception e){
            System.out.println("Exception propogation handled");
        }
    }
}
