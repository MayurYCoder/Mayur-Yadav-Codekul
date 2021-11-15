package assignments;

public class Assignment4 {


    public static void main(String[] args) {
        int a=10;
        int b=20;
      /* int c=a;
       a=b;
       b=c;

        System.out.println(a+" "+b);

       */
        int c=a+b;
        a=c-a;
        b=c-b;
        System.out.println(a+" "+b);

    }

}
