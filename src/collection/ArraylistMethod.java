package collection;

import java.util.ArrayList;
import java.util.List;

public class ArraylistMethod {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(6);
        list2.add(8);

        list1.addAll(list2);
        // list1.retainAll(list2);
        list1.removeAll(list2);
        System.out.println(list1);
    }
}
