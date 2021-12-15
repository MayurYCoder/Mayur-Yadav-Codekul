package java8.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        Integer i=8;

        Function<Integer,Integer> function=(Integer)->{
            if (Integer >5);
            return Integer;
        };

        Function<Integer,Integer>function1=f->f*2;

        System.out.println(function.andThen(function1).apply(i));
    }
}
