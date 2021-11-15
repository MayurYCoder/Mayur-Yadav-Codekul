package controlflow.ifelse;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no");
        i=obj.nextInt();

        if(i%2==0){
            System.out.println("the given no is even");
        }else{
            System.out.println("given no is odd1");
        }
    }
}
