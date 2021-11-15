package controlflow.ifelse;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        int i;
        int j;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter your age");
        i=obj.nextInt();

       /* if(i>=18){
            System.out.println("you can vote");
        }else{
            System.out.println("you cannot vote");
        }
        String str=i>=18?"you can vote":"you cannot vote";
        System.out.println(str); */

        j= obj.nextInt();
        int result=i>j?i:j;
        System.out.println(result);



    }
}
