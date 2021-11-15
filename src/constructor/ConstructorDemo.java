package constructor;
//constructor==> constructor is a special type of function which automatically invoke when object of class created.
//There are two types==> 1.default
//                       2.Parametric


public class ConstructorDemo {
    public ConstructorDemo(){
       System.out.println("in constructor");
    }
    public ConstructorDemo(int i){
        System.out.println("in constructor " + i);
    }

    public static void main(String[] args) {
        ConstructorDemo obj= new ConstructorDemo(20);
        ConstructorDemo objdefault= new ConstructorDemo();
    }
}
