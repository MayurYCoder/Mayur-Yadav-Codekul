package superKeywordDemo;

public class SuperConstructor {
    SuperConstructor(){
        System.out.println("Iam in a class superconstructor");
    }
}
class B extends SuperConstructor {
    B(){
        System.out.println("I am in class B");
    }

    public static void main(String[] args) {
        B obj= new B();
    }
}
