package assignments;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        int no;
        int year;
        int week;
        int day;

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of days for conversion");
        no=obj.nextInt();

        year= no/365;
        System.out.println(year+"year");

        week= (no%365)/7;
        System.out.println(week+"week");

        day=(no%365)%7;
        System.out.println(day+"day");
    }

}
