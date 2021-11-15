package assignments;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        int no;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number to check");
        no=obj.nextInt();
        int count=1;
        for (int i=2;i<no;i++){
            if (no%i==0){
                count=count+1;
            }
        }
        if (count>=2){
            System.out.println("Given no is not prime");
        }else{
            System.out.println("Given no is prime");
        }
    }
}
