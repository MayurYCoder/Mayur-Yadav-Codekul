package Inheritance;

interface interface1 {
    String msg();

    static void scan(){
        System.out.println("In a static method");
    }
}


interface interface2 {
    void display();

    static void print() {
        System.out.println("multiple inheritance resolved");
    }
}

public class MultipleInheritance implements interface1, interface2 {

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.display();
        interface2.print();

        interface1.scan();

    }

    @Override
    public String msg() {
        return null;
    }

    @Override
    public void display() {
    }

}
