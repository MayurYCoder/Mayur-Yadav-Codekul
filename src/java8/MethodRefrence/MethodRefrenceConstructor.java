package java8.MethodRefrence;

public class MethodRefrenceConstructor {
    public static void main(String[] args) {
        //refering constructor
        Myinterface5 myinterface5=MethodRefrenceConstructor::new;
        //constructor calling
        myinterface5.methodref();


    }
    public MethodRefrenceConstructor(){
        System.out.println("In a constructor");
    }

    interface Myinterface5{
        MethodRefrenceConstructor methodref();
    }
}
