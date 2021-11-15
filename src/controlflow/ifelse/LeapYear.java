package controlflow.ifelse;

import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args) {
        int i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Year");
        i=obj.nextInt();

        if((i%400==0 )|| (i%4==0 && i%100!=0)){
            System.out.println("this year is leap year");
        }else{
            System.out.println("this year is not leap year");
        }





    }

}
