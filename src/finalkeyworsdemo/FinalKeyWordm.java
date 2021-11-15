package finalkeyworsdemo;

public class FinalKeyWordm {
   // final void m1(){
   //     System.out.println("in a FinalKeyword class");
    //}
}
class B extends FinalKeyWordm{
    void m1(){
        System.out.println("in a override class");
    }

    public static void main(String[] args) {
        B obj= new B();
        obj.m1();
    }
}
