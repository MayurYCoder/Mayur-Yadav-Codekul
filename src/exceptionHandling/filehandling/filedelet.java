package exceptionHandling.filehandling;

import java.io.File;

public class filedelet {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Lenovo\\IdeaProjects\\acess modifier\\src\\exceptionHandling\\filehandling\\sample.txt");

        if (file.delete()){
            System.out.println("File deleting sucessful");
        }else{
            System.out.println("There is some issue during file deleting");
        }

    }
}
