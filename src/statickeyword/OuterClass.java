package statickeyword;

public class OuterClass {
    int i=80;

    static class innerclass{
        int i=10;

        public static void main(String[] args) {
            innerclass obj=new innerclass();
            System.out.println(obj.i);
        }
    }

    public static void main(String[] args) {
        OuterClass obj= new OuterClass();
        System.out.println(obj.i);

        OuterClass.innerclass obj1= new OuterClass.innerclass();
        System.out.println(obj1.i);


    }
}
