package exceptionHandling.throwandthrows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {
    void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("text.txt");
    }
}
class Test{
    public static void main(String[] args) {
        ThrowsDemo obj=new ThrowsDemo();
        try {
            obj.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
