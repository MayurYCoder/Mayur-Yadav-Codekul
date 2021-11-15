package controlflow.ifelse;

import java.util.Scanner;

public class IfelseDemo {

    public static void main(String[] args) {
        int age;
        String nationality;
      Scanner obj= new Scanner(System.in);
         System.out.println("Enter your age");
        age= obj.nextInt();
        System.out.println("enter your nationality");
        nationality=obj.next();

        if(age>=18){
            if(nationality.equals("Indian")) {
                System.out.println("you can vote");
            }else{
                System.out.println("Not indian");
            }
        }else{
            System.out.println("you can't vote");
        }



   /*     int a;
        int b;
        int c;

        Scanner obj= new Scanner(System.in);
        System.out.println("enter the value of A");
        a=obj.nextInt();
        System.out.println("Enter the value of b");
        b=obj.nextInt();
        System.out.println("enter the value of c");
        c= obj.nextInt();


        if(a>b && a>c && a>d){

            System.out.println("bigger no is a");
        }else if(b>c && b>d){
            System.out.println("bigger no is b");
        }else if(c>d){
            System.out.println("bigger no is c");
        }else{
            System.out.println("bigger no is d");
        }

       if(a>b){
           if(a>c){
               System.out.println("a is greater");
           }else{
               System.out.println("c is greater");
           }

       }else if (b>c){
           System.out.println("b is greater");
       }else{
           System.out.println("c is greater");
       }
*/
    }
}
