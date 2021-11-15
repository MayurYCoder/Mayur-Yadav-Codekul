package assignments;

import java.util.Scanner;

public class PowerAss30 {
    public static void main(String[] args) {
        int no;
        int power;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        no= obj.nextInt();
        System.out.println("Enter the power");
        power=obj.nextInt();
        int result=1;
        for(int i=1;i<=power;i++){
            result=result*no;
        }
        System.out.println(result);
    }
}
