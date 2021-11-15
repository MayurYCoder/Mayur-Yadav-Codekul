package controlflow.forloop;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the no");
        int no=S.nextInt();
        int result=0;

        for(int i=2; i<=no-2;i++){
            if(no%i==0){
                result=result+1;
            }
        }

        if(result>0){
            System.out.println("Given no is not prime");
        }else{
            System.out.println("given no is prime no");
        }
    }
}
