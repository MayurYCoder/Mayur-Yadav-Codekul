package Inheritance;
//This is example of the simple inheritance
public class Animal {
    void M() {
        System.out.println("animals are vegans");
    }
}
class Dog extends Animal{
  void M1(){
      System.out.println("Dogs are vegans");
    }

    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.M();

        Dog obj1=new Dog();
        obj1.M1();
        obj1.M();

    }
}
