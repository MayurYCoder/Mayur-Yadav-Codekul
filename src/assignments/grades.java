package assignments;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        int Maths,Chemistry,Physics,Biology,English;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Marks in Maths");
        Maths=obj.nextInt();
        System.out.println("Enter the Marks in Chemistry");
        Chemistry=obj.nextInt();
        System.out.println("Enter the Marks in Physics");
        Physics= obj.nextInt();
        System.out.println("Enter the Marks in Biology");
        Biology=obj.nextInt();
        System.out.println("Enter the Marks in English");
        English=obj.nextInt();

        int Total=Maths+Chemistry+Biology+Physics+English;
        System.out.println("Total marks is==>"+Total);
        double percentage=Total/5;
        System.out.println("Percentage is ==>"+percentage);
        if (percentage>=90){
            System.out.println("Grade A");
        }else if (percentage>=80){
            System.out.println("Grade B");

        }else if (percentage>=70){
            System.out.println("Grade C");
        }else if (percentage>=60){
            System.out.println("Grade D");
        }else if (percentage>=40){
            System.out.println("Grade E");
        }else{
            System.out.println("Fail");
        }
    }
}
