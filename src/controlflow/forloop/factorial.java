package controlflow.forloop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int no;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no");
        no=obj.nextInt();
        int result=1;

        for(int i=no;i>=1;i--){
            result=result*i;
        }
        System.out.println("factorial is ==>"+ result);
    }
}
