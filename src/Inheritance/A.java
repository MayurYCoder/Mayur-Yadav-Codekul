package Inheritance;

public class A {
    void showA(){
        System.out.println("in a class a");
    }
}
class B extends A{
    void showB(){
        System.out.println("in a class B");
    }
}
class C extends A{
    void showC(){
        System.out.println("in class c");
    }

    public static void main(String[] args) {
        A obj=new A();
        obj.showA();
        System.out.println("____________________");
        B obj1= new B();
        obj1.showA();
        obj1.showB();
        System.out.println("____________________");

        C obj2=new C();
        obj2.showA();
        obj2.showC();
    }
}