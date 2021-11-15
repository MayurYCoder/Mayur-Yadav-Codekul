package assignments;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the last value of fibbonacci");
        n=obj.nextInt();

        int a=0;
        int b=1;
        int c;
        System.out.print(a+b);
        for (int i=1;i<=n;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;

        }
    }
}
