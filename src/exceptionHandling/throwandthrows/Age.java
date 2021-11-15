package exceptionHandling.throwandthrows;

import java.util.Scanner;

public class Age {
    public static void main(String[] args)  {
        int age;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the age");
        age=obj.nextInt();

        if (age<18){
            try {
                throw new Exception("you cannot vote");
            } catch (Exception e) {
                System.out.println(e);
            }
        }else{
            System.out.println("you can vote");
        }
    }
}
