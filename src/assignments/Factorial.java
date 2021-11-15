package assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int no;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no to find factorial");
        no= obj.nextInt();
        int result=1;
        for (int i=no;i>=1;i--){
            result=result*i;
        }
        System.out.println(result);
    }
}
