package string;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the given input");
        String str = obj.next();
        String ret = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ret = ret + str.charAt(i);
        }
        System.out.println(ret);

        if (ret.equals(str)) {
            System.out.println("Given no is palindrome ");
        } else {
            System.out.println("given no is not palindrome");
        }
    }
}
