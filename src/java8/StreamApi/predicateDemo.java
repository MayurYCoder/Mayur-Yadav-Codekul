package java8.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class predicateDemo {
    public static void main(String[] args) {
        Integer i=8;
        List<Integer> list= Arrays.asList(1,2,3,5,6,58);
        Predicate<Integer>predicate=p->p>5;

        System.out.println(predicate.test(i));

        Stream<Integer>stream=list.stream().filter(predicate);

        stream.forEach(System.out::println);
    }
}
