package java8;



// lambda exp is a anonymous function.
// use - it takes less  code.
//     - it used to give the implementation of functional interface


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpression {
    public static void main(String[] args) {

        Myinterface1 myinterface1=()->{
            return "hello";
        };
        System.out.println(myinterface1.msg());


        Myinterface2 myinterface2=(n,b)->{
          return n+b;
        };
        System.out.println(myinterface2.add(1,8));

        List<Integer>list= Arrays.asList(1,232,12,32);

        Consumer<Integer>consumer=(i)->{
            System.out.println(i);
        };
        list.forEach(consumer);

    }
    @FunctionalInterface
    interface Myinterface1{
        String msg();
    }
    @FunctionalInterface
    interface Myinterface2{
        int add(int a,int b);
    }

}
