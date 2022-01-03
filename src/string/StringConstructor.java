package string;

import java.util.Scanner;

public class StringConstructor {

    public static void main(String[] args) {
        char[] Arr={'a','b','c'};
        byte[]Arr1={101,102,103};  //it returns its aski values
        String obj=new String(Arr1);

        System.out.println(obj);
/*

        String Name="ab  123";
        int i=Name.length();
        System.out.println(Name.isEmpty());
        if (i==0){
            System.out.println("name is empty");
        }else {
            System.out.println(Name);
            System.out.println(Name.trim());
        }

        */

    }

}

