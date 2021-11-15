package assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GreaterNo {
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the 1st numbers");
        a=obj.nextInt();
        System.out.println("Enter the 2nd numbers");

        b=obj.nextInt();
        System.out.println("Enter the 3rd numbers");

        c=obj.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("greater no is"+a);
            }else{
                System.out.println("greater no is"+c);
            }

        }else if(b>c){
            System.out.println("greater no is"+b);
        }else{
            System.out.println("greater no is"+c);
        }
    }
}
