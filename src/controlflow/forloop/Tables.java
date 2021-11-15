package controlflow.forloop;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no to print table");
        int no =obj.nextInt();

        for(int i=0; i<=10;i++){
            System.out.println(no*i);
        }

    }
}
