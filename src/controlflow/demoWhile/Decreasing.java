package controlflow.demoWhile;

import java.util.Scanner;

public class Decreasing {
    public static void main(String[] args) {
        int i;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the last no");
        i=obj.nextInt();

        while(i>=1){
            System.out.print(" "+i);
            i=i-2;
        }
    }
}
