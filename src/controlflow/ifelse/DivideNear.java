package controlflow.ifelse;

import java.util.Scanner;

public class DivideNear {
    public static void main(String[] args) {
        int no;
        int divide;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no");
        no=obj.nextInt();
        System.out.println("Enter the no to divide");
        divide=obj.nextInt();
        if (no%divide!=0){
            int a=no%divide;
            int b=no/divide;
            int c=(b*divide)+divide;
            int d=b*divide;
            if((c-no)>=(no-d)){
                System.out.println("Nearest no is==>"+d);
            }else{
                System.out.println("Nearest no is ==>"+c);
            }
        }else{
            int result=no/divide;
            System.out.println(result);
        }
    }
}
