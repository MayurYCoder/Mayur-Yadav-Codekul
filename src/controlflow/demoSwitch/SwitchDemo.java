package controlflow.demoSwitch;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        int i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number");
        i=obj.nextInt();

        switch (i){
            case 1:
                int j=0;
                System.out.println("Enter the no");
                j=obj.nextInt();
               switch (j) {
                   case 10:
                       System.out.println(10);
                       break;
                   case 20:
                       System.out.println(20);
                       break;
               }

                System.out.println("one");
            break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("invalid number");
        }
    }
}
