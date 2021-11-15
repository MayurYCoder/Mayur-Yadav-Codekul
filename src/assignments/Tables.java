package assignments;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        int a;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no of table");
        a=obj.nextInt();
        int result=0;
        for (int i=1;i<=10;i++){
            result=result+a;
            System.out.println(result);
        }
    }
}
