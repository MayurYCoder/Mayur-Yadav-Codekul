package assignments;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        int CP;
        int SP;
        int Loss;
        int Profit;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the cost price");
        CP=obj.nextInt();
        System.out.println("Enter the selling price");
        SP=obj.nextInt();
        if (CP>SP){
            Loss=CP-SP;
            System.out.println("Loss is==>"+Loss);
        }else{
            Profit=SP-CP;
            System.out.println("Profit is==>"+Profit);
        }
    }
}
