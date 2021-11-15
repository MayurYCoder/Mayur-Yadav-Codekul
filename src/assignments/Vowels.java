package assignments;


import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {


        char a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the variable");

        a=obj.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            System.out.println("This is vowel");
        }else{
            System.out.println("This is consonent");
        }
    }
}
