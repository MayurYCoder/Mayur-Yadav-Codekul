package superKeywordDemo;

public class SuperMethod {
    void cat(){
        System.out.println("In Super class");

    }
}
class ChildClass extends SuperMethod{
    void cat(){
        System.out.println("in child class");
    }

    void show(){
       cat();
       // super.cat();

    }

    public static void main(String[] args) {
        ChildClass obj= new ChildClass();
        obj.show();
    }
}
