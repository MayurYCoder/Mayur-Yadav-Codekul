package assignments;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        int length;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the length ");
        length= obj.nextInt();
        double area=0.4330*length*length;
        double perimeter=3*length;

        System.out.println("area is==>"+area);
        System.out.println("perimeter is==>"+perimeter);

    }
}
