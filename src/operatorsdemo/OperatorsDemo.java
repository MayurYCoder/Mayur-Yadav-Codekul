package operatorsdemo;

public class OperatorsDemo {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);

        System.out.println(i--);
        System.out.println(--i);
        int k = 10;
        int j = 3;
       // System.out.println(j % i);
        //System.out.println(k / i);

        System.out.println(k<<2);
        System.out.println(k>>2);

        if ( k==10 || j==4){
            System.out.println("If Executed");
        } else{
           System.out.println("Else executed");
        }
        if ( k==10 && j==3){
            System.out.println("If Executed");
        } else{
            System.out.println("Else executed");
        }
    }
}
