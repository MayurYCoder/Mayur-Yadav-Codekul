package controlflow.demoWhile;

import java.util.Scanner;

public class RandomNo {
    public static void main(String[] args) {
        int random=(int)(Math.random()*200)+1;
        int num;
double d;
        Scanner obj= new Scanner(System.in);
        do{
            System.out.println("Enter the no");
            num=obj.nextInt();

            if(num>random){
                System.out.println("No is Greater");
            }else if(num<random){
                System.out.println("no is less");
            }else{
                System.out.println("Your guess is correct");
            }

        }while(num!=random);
    }
}
