package polymorphism.methodOverriding;

public class Methodoverriding {
    public void display(){
        System.out.println("in a dspllay method");
    }
}
class Methodoverriding1 extends Methodoverriding{
    public void display(){
        System.out.println("in a display method2");
    }

    public static void main(String[] args) {
        Methodoverriding1 obj=new Methodoverriding1();
        obj.display();
    }
}
