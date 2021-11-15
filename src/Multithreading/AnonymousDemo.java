package Multithreading;

public class AnonymousDemo {
    public static void main(String[] args) {
        Myinterface obj=new Myinterface() {
            @Override
            public Integer add(int a, int b) {
                return a+b;
            }

            @Override
            public Integer sub(int a, int b) {
                return a-b;
            }
        };

        System.out.println(obj.add(5,2));
        System.out.println(obj.sub(5,20));

    }
}
interface Myinterface{
    Integer add(int a,int b);
    Integer sub(int a,int b);
}
