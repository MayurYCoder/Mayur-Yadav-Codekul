package assignments;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        int Principle;
        int Period;
        int ROI;
        int SI;

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter th principle amount");
        Principle=obj.nextInt();
        System.out.println("Enter the rate of intrest");
        ROI=obj.nextInt();
        System.out.println("Enter the time period");
        Period=obj.nextInt();
        SI= (int) (Principle*ROI*Period)/100;

        System.out.println(SI);
    }
}
