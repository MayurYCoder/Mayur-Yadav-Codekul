package statickeyword;

public class StaticMethod {
    static void display()
    {
        System.out.println("i am in a static method without object ");
    }

    public static void main(String[] args) {
        display();
        Magic.show();

    }
}
class Magic{
    static void show(){
        System.out.println("i am in another class");
    }
}
