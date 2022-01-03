package exceptionHandling.throwandthrows;

import java.util.Scanner;

public class Merriage {


    public static void main(String[] args) throws Exception {
        int i;
        Scanner obj=new Scanner(System.in);
        i= obj.nextInt();
        if (i<=21){
            throw new Exception("You are under age");
        }else {
            System.out.println("you are eligible to merriage");
        }

    }


}
