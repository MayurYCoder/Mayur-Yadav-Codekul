package assignments;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        int day;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the no of day");
        day=obj.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid no");
                break;


        }
    }
}
