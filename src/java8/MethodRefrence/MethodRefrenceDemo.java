package java8.MethodRefrence;

import java.util.ArrayList;
import java.util.List;

public class MethodRefrenceDemo {
    public static void main(String[] args) {
        //method refrence to the instance method
        MethodRefrenceDemo obj = new MethodRefrenceDemo();
        //refer method
        Myinterface3 myinterface3 = obj::msg;
        //call method
        System.out.println(myinterface3.display());

        // You can use anonymous object also
        Myinterface3 myinterface31=new MethodRefrenceDemo()::msg;
        System.out.println(myinterface31.display());

      /*  List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.forEach(System.out::println);  //lambda function is replaced by this

        list.forEach(s->{
            System.out.println(s);
        });
       */
    }
    public  String msg() {
        return "Welcome to the method refrenace by instance method";
    }
}
@FunctionalInterface
interface Myinterface3 {
    String display();
}
