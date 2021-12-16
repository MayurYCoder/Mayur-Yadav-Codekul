package java8.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedDemo {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(12,2,45,87,22,32,16);

        list.stream()
                .sorted()
                .forEach(System.out::println);
        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
