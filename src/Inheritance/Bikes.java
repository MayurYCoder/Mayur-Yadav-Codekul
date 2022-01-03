package Inheritance;
//This is example of the multiple inheritance.
public class Bikes {
    void bikes(){
        System.out.println("welcome to bikes");
    }
}
class Cruser extends Bikes{
    void bikes1(){
        System.out.println("Cruser bikes");

    }
}
class Sport extends Cruser{
    void Bikes2(){
        System.out.println("Sport bikes");
    }

    public static void main(String[] args) {
        Bikes obj=new Bikes();
        obj.bikes();

        Cruser obj2=new Cruser();
        obj2.bikes();
        obj2.bikes1();

        Sport obj3=new Sport();
        obj3.bikes();
        obj3.bikes1();
        obj3.Bikes2();
    }
}
