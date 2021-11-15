package assignments;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        int Radious;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the radious");
        Radious=obj.nextInt();
        double area=2*3.142*Radious;
        double circumference=3.142*Radious*Radious;

        System.out.println("Area is==>"+area);
        System.out.println("Circumference is ==>"+circumference);

    }
}
