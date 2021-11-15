package superKeywordDemo;

public class Dog {
    String colour= "black";
}
class Cat extends Dog{
    String colour= "white";

    void show(String colour){
        System.out.println(colour);
        System.out.println(this.colour);
        System.out.println(super.colour);
    }

    public static void main(String[] args) {
        Cat obj= new Cat();
        obj.show("green");
    }
}

