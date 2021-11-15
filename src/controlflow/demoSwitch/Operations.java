package controlflow.demoSwitch;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        int i;
        int j;
        char operator;

        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the first no");
        i=obj.nextInt();
        System.out.println("Enter the second no");
        j=obj.nextInt();
        System.out.println("Enter the operator");
        operator=obj.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(i+j);
                break;
            case '-':
                System.out.println(i-j);
                break;
            case '*':
                System.out.println(i*j);
                break;
            case '/':
                System.out.println(i/j);
                break;
            default:
                System.out.println("invalid operation");
        }
    }
}
