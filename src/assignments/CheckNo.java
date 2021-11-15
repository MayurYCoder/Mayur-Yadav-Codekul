package assignments;

import java.util.Scanner;

public class CheckNo {
    public static void main(String[] args) {
        int a;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the no");
        a=obj.nextInt();
        if (a>1){
            System.out.println("no is positive");
        }else if (a==0){
            System.out.println("no is zero");
        }else{
            System.out.println("no is negative");
        }
    }
}
