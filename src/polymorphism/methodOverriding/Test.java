package polymorphism.methodOverriding;

public class Test {
    void show(int a){
        System.out.println("1");
    }
}
class Exam extends Test{
    @Override
    void show(int a) {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test obj= new Test();
        obj.show(1);
        Exam obj1=new Exam();
        obj1.show(2);
    }
}
