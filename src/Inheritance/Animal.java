package Inheritance;

public class Animal {
    void M() {
        System.out.println("animals are vegans");
    }
}
class Dog extends Animal{
    void M1(){
        System.out.println("Dogs are mixed");
    }
    public static void main(String[] args) {
        Dog obj1= new Dog();
        obj1.M();
        obj1.M1();

        Animal obj= new Animal();
        obj.M();
       // obj.M1();


    }
}
