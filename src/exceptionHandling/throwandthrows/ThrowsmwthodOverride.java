package exceptionHandling.throwandthrows;

import java.io.IOException;

public class ThrowsmwthodOverride {
    void msg() throws IOException {

    }
}
class child extends ThrowsmwthodOverride {
    void msg() throws IOException {
        System.out.println("in a child class");
    }

    public static void main(String[] args) {
        child obj=new child();
        try {
            obj.msg();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
