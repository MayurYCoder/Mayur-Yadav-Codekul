package finalkeyworsdemo;

public class FinalKeyWordDemo {
    final int i ;
    public FinalKeyWordDemo(){
        i=10;
    }

    public void display(){
        //i=16;
    }

    public static void main(String[] args) {
        FinalKeyWordDemo Demo= new FinalKeyWordDemo();
        Demo.display();
        System.out.println(Demo.i);
    }
}
class Test  {
    public void display() {
        System.out.println("in display");
    }
}
