package superKeywordDemo;

public class SuperKeywordDemo {
    int A=20;
}
class Smallsuper extends SuperKeywordDemo{
    int A=35;

    void show(){
        System.out.println(super.A);
    }

    public static void main(String[] args) {
        Smallsuper obj= new Smallsuper();
        obj.show();
    }
}
