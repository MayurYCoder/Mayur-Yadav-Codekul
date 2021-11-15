package assignments;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        int unit;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the numbers of units");
        unit=obj.nextInt();
        double FirstFifty=50*0.50;
        double next100=0.75*100;
        double next100100=100*1.20;
        double next250=250*1.5;

        if(unit<=50){
            double bill=0.5*unit;
            double grossbill=bill+(bill*0.2);
            System.out.println("your electricity bill is "+grossbill);
        }else if(unit>50&&unit<=150){
            double bill=FirstFifty+((unit-50)*0.75);
            double grossbill=bill+(bill*0.2);
            System.out.println("your electricity bill is "+grossbill);
        }else if(unit>150&&unit<=250){
            double bill=FirstFifty+next100+((unit-150)*1.25);
            double grossbill=bill+(bill*0.2);
            System.out.println("your electricity bill is "+grossbill);
        }else{
            double bill=FirstFifty+next100+next100100+((unit-250)*1.5);
            double grossbill=bill+(bill*0.2);
            System.out.println("your electricity bill is "+grossbill);
        }
    }
}
