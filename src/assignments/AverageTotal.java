package assignments;

import java.util.Scanner;

public class AverageTotal {
    public static void main(String[] args) {
        int Maths,Chemestry,Geometry,Geography,English,Hindi,Physics;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the marks in Maths");
        Maths= obj.nextInt();
        System.out.println("Enter the marks in chemistry");
        Chemestry =obj.nextInt();
        System.out.println("Enter the marks in geometry");
        Geometry=obj.nextInt();
        System.out.println("Enter the marks in geography");
        Geography=obj.nextInt();
        System.out.println("Enter the marks in hindi");
        Hindi= obj.nextInt();
        System.out.println("Enter the marks in physics");
        Physics=obj.nextInt();

        int TotalMarks=Maths+Chemestry+ Geometry+Geography+Hindi+Physics;
        double Average=TotalMarks/6;

        System.out.println("total marks is ==>"+TotalMarks);
        System.out.println("Average is ==>"+Average);

    }
}
