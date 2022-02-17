package string;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter the given No");
      String input=obj.next();
      String ret="";

      for (int i=input.length()-1;i>=0;i--){
          ret=ret +input.charAt(i);
      }
      if (input.equals(ret)){
          System.out.print("Given No is palindrome");
      }else{
          System.out.println("Given no is not palindrome");
      }

    }
}
