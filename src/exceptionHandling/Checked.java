package exceptionHandling;

import java.io.FileInputStream;

public class Checked {
    public static void main(String[] args) {
       // FileInputStream file=new FileInputStream("d:/abc.txt");
        try{
            Class.forName("com.mysql.jdbc.Driver");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
