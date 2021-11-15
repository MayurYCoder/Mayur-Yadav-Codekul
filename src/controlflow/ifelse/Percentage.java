package controlflow.ifelse;

import java.util.Scanner;

public class Percentage {

    public static void main(String[] args) {
        int maths;
        int science;
        int history;
        int english;
        int geometry;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the marks in maths");
        maths=obj.nextInt();
        System.out.println("Enter the marks in science");
        science=obj.nextInt();
        System.out.println("Enter the marks in history");
        history= obj.nextInt();
        System.out.println("Enter the marks in english");
        english=obj.nextInt();
        System.out.println("Enter the marks in geometry");
        geometry=obj.nextInt();

        double totalmarks= maths + science + history +english + geometry;
        System.out.println("Total marks is ==> " + totalmarks);

        double percentage= (totalmarks/500)*100;
        System.out.println("Your percentage is==> " + percentage);

        if(percentage>60){
            if(percentage>75){
                System.out.println("your grade is A+");
            }else {
                System.out.println("Your grade is A");
            }
        }else if(percentage>35){
            if(percentage>50) {
                System.out.println("Your grade is B+");
            }else{
                System.out.println("Your grade is B");
            }
        }else{
            System.out.println("Your are Failed");

        }

    }
}
