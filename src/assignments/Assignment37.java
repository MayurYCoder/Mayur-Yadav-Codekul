package assignments;

import java.util.Scanner;

public class Assignment37 {
    public static void main(String[] args) {
        int no,a,sum = 0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no to print sum of that no");
        no=obj.nextInt();

       while (no>0) {
           a = no % 10;
           sum = (sum + a);
           no = no / 10;
       }
           System.out.println("The sum of all digits is==>" + sum);

    }
}
