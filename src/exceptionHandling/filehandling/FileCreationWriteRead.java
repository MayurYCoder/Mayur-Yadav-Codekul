package exceptionHandling.filehandling;

import java.io.*;

public class FileCreationWriteRead {
    public static void main(String[] args) {

       /* -code to create a new file.

       File file=new File("C:\\Users\\Lenovo\\IdeaProjects\\acess modifier\\src\\exceptionHandling\\filehandling\\Filecreation.txt");
        try {
            file.createNewFile();
            } catch (IOException e) {
            System.out.println("unable to create file");
            e.printStackTrace();
        }


        //-code to write a new file.//

        try {
            FileWriter fileWriter=new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\acess modifier\\src\\exceptionHandling\\filehandling\\Filecreation.txt");
            fileWriter.write("File write sucessfully done");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
       */

        //-code to read a new file

        try {
            FileReader fileReader=new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\acess modifier\\src\\exceptionHandling\\filehandling\\Filecreation.txt");
            int i=fileReader.read();

            while (i>0){
                System.out.print((char) i);
                i=fileReader.read();
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
