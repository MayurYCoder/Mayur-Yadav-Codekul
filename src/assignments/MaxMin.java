package assignments;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first no");
        a=obj.nextInt();
        System.out.println("enter the second no");
        b= obj.nextInt();
        if (a>b){
            System.out.println("maximum no is"+a);
            System.out.println("minimum no is"+b);
        }else{
            System.out.println("maximum no is"+b);
            System.out.println("minimum no is"+a);

        }
    }
}
