package exceptionHandling.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingClose {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            System.out.println("in a try block");

            fis =new FileInputStream("Test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        finally {
            System.out.println("in a finally");
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
