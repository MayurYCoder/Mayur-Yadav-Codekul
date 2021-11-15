package exceptionHandling.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilehandlingDemo {
    public static void main(String[] args) {
        File file= new File("C:\\Users\\Lenovo\\IdeaProjects\\acess modifier\\src\\exceptionHandling\\filehandlingtext.txt");
        FileOutputStream fileOutputStream=null;
        FileInputStream fileInputStream=null;
        try{
            fileOutputStream=new FileOutputStream(file);
            String str="Welcome";
            byte[] arr=str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("file write successfull");
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try{
            fileInputStream=new FileInputStream(file);
            int i=fileInputStream.read();
            while(i>0){
                System.out.print((char)i);
                i=fileInputStream.read();
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
