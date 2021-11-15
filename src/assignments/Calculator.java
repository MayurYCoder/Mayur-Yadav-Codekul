package assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a;
        int b;
        char x;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first no");
        a=obj.nextInt();
        System.out.println("Enter the second no");
        b=obj.nextInt();
        System.out.println("Enter the operation");
        x=obj.next().charAt(0);
        switch (x){
            case '+':
                System.out.println(a+b);
                break;
            case'-':
                System.out.println(a-b);
                break;
            case'*':
                System.out.println(a*b);
                break;
            case'/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid operation");

        }
    }
}
