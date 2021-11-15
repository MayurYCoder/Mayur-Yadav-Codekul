package exceptionHandling.filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethod {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Lenovo\\IdeaProjects\\acess modifier\\src\\exceptionHandling\\filehandling\\BufferWrite.javaBufferWriter.txt");
        System.out.println(file.isFile());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(file.isDirectory());
        System.out.println(file.getPath());

        File file1=new File("C:\\Users\\Lenovo\\IdeaProjects\\acess modifier\\src\\exceptionHandling\\filehandling\\sample.txt");
        boolean flag=file1.createNewFile();
        System.out.println(flag);
        if (file1.createNewFile()){
            System.out.println("FIle created");
        }else{
            System.out.println("Already exist");
        }

        boolean dir=new File("C:\\Users\\Lenovo\\IdeaProjects\\acess modifier\\newDir").mkdirs();
        System.out.println(dir);

        File file2=new File("C:\\Users\\Lenovo\\IdeaProjects\\acess modifier\\newDir\\sample.txt");
        boolean f=file2.createNewFile();
        System.out.println(f);
        System.out.println();

        File file3=new File("C:\\Users\\Lenovo\\IdeaProjects");
        String[] arr=file3.list();
        for (String ar:arr){
            System.out.println(ar);
        }
    }
}
