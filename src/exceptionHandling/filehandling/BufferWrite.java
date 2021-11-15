package exceptionHandling.filehandling;

import java.io.*;

public class BufferWrite {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter=new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\acess modifier\\src\\exceptionHandling\\filehandling\\BufferWrite.javaBufferWriter.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

            bufferedWriter.write("i am in pune");
            System.out.println("buffer write sucessfully");

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader=new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\acess modifier\\src\\exceptionHandling\\filehandling\\BufferWrite.javaBufferWriter.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            int i=bufferedReader.read();
            while(i>0){
                System.out.print((char)i);
                i=bufferedReader.read();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
