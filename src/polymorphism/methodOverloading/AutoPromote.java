package polymorphism.methodOverloading;

public class AutoPromote {
    void show(int a){
        System.out.println("int");
    }
    void show(String a){
        System.out.println("String");
    }

    public static void main(String[] args) {
        AutoPromote obj=new AutoPromote();
        obj.show("a");
        obj.show(1);
    }
}
