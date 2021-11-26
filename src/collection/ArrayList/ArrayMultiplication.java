package collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayMultiplication {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        List<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(30);
        list2.add(20);
        list2.add(10);

        
        int j = list2.size() - 1;
        for (int i = 0; i <= list1.size() - 1; i++) {
            System.out.println(list1.get(i) * list2.get(j));
            j--;

        }
    }
}

