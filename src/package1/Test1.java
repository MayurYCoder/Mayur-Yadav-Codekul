package package1;

public class Test1 {
    public int a =10;
    private int b =20;
    int c =20;
    protected int d=30;

    public static void main(String[] args) {
        Test1 obj = new Test1();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }

}
