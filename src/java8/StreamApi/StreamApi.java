package java8.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        Function<Integer,Integer>function1=f->f*2;

        Stream<Integer>list1=list.stream()
                .map(function1);
        list1.forEach(System.out::println);



        List<String>list2=Arrays.asList("java","is","python","javascript");

        Function<String,String>function=s->s.toUpperCase();
        list2.stream().map(function).forEach(System.out::println);

    }

}
