package assignments;

public class PolymorphismDemo {
    public void add(int a, int b){
        System.out.println( a+b);

    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    //by changing the return type
    public double add(double a, double b){
        return a+b;
    }


    public static void main(String[] args) {
        PolymorphismDemo obj=new PolymorphismDemo();
        obj.add(10,20,30);
        System.out.println(obj.add(10,20.1));
    }
}
