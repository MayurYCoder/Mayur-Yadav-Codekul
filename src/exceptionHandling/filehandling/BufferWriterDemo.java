package exceptionHandling.filehandling;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\acess modifier\\src\\exceptionHandling\\filehandling\\BufferWriterDemo.javaBufferdemo.txt");
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);

            String str="i am in pune";
            byte[]arr=str.getBytes();
            bufferedOutputStream.write(arr);
            System.out.println("file write sucessfully");

            bufferedOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\acess modifier\\src\\exceptionHandling\\filehandling\\BufferWriterDemo.javaBufferdemo.txt");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);

            int i=bufferedInputStream.read();
            while(i>0){
                System.out.print((char)i);
                i=bufferedInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
