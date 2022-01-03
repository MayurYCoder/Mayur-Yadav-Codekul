package java8.MethodRefrence;

public class MethodRefrenceStatic {
    public static void main(String[] args) {
        //by static method there is no need to create an object
        //refer
        Myinterface4 myinterface4=MethodRefrenceStatic::msg;
       //calling method
        System.out.println(myinterface4.display());

    }

    public static String msg(){
        return("Welcome to the method reference by the static method");
    }
}
interface Myinterface4{
    String display();
}
