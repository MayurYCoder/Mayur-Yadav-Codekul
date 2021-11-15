package assignments;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {


    int Year;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the year");
    Year=obj.nextInt();
    if (Year%400==0||(Year%4==0&&Year%100!=0)){
        System.out.println("this is leap year");
        }else{
        System.out.println("this is not leap year");
    }

    }
}
