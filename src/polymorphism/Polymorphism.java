package polymorphism;

public class Polymorphism {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Polymorphism obj= new Polymorphism();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,5));
    }
}
