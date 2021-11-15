package assignments;

import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        int length;
        int breadth;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of length");
        length= obj.nextInt();
        System.out.println("Enter the value of breadth");
        breadth=obj.nextInt();

        double Area=length*breadth;
        int Perimeter=2*(length+breadth);

        System.out.println("Area is==>"+Area);
        System.out.println("Perimeter is==>"+Perimeter);
    }
}
