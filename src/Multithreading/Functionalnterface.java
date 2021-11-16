package Multithreading;
// In functional interface we can use lamda function->
public class Functionalnterface {
    public static void main(String[] args) {

        Myinterface1 obj=(int a, int b)-> {
                return a+b;

        };
        System.out.println(obj.add(1,2));
    }
}
@FunctionalInterface
interface Myinterface1{
    Integer add(int a,int b);
}