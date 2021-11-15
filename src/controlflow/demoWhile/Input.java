package controlflow.demoWhile;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int num;
        int sum=0;

        Scanner obj=new Scanner(System.in);

        char choice;

        do{
            System.out.println("Enter the no");
            num=obj.nextInt();
            sum=num+sum;
            System.out.println("Do you want continue");
            choice=obj.next().charAt(0);
        }while(choice=='Y'||choice=='y');
        System.out.println(sum);
    }
}
