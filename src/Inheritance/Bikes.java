package Inheritance;

public class Bikes {
    void bikes(){
        System.out.println("Sports bikes");
    }
}
class Cruser extends Bikes{
    void cruser(){
        System.out.println("Cruser bikes");
    }
}
class Classic extends Cruser{
    void classic(){
        System.out.println("Classic bikes");
    }

    public static void main(String[] args) {
        Bikes obj= new Bikes();
        obj.bikes();
        //obj.Cruser();
        //obj.Classic();

        Cruser obj1= new Cruser();
        obj1.bikes();
        obj1.cruser();
        //obj1.classics();

        Classic obj2=new Classic();
        obj2.bikes();
        obj2.cruser();
        obj2.classic();

    }
}
