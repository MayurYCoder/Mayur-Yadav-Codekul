package Inheritance;

public class Birds {
    void show(){
        System.out.println("i am in a bird class");
    }
}
class Pecock extends Birds{
    void display() {
        System.out.println("pecock can not fly");
    }
}
class Duck extends Pecock{
    void seen() {
        System.out.println("duck can swim");
    }

    public static void main(String[] args) {
        Birds obj=new Birds();
        obj.show();

        Pecock obj1=new Pecock();
        obj1.show();
        obj1.display();

        Duck obj2=new Duck();
        obj2.show();
        obj2.seen();
        obj2.display();
    }
}
