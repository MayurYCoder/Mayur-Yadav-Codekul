package assignments;

import java.util.Scanner;

public class Assignment36 {
    public static void main(String[] args) {
        int no;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no to count digits");
        no=obj.nextInt();
        int count=0;
        while (no!=0){
            no=no/10;
            count=count+1;

        }
        System.out.println("The no of digits in the no is==>"+count);
    }

}
