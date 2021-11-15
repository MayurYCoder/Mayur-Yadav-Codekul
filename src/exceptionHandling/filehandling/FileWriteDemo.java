package exceptionHandling.filehandling;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter=new FileWriter("fileWritertest.demo");
            fileWriter.write("Today is thursday");
            System.out.println("File write sucessfully");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader=new FileReader("fileWritertest.demo");
            int i=fileReader.read();
            while (i>0){
                System.out.println((char) i);
                i=fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
