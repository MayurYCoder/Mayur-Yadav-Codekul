package collection.Collection.Set;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer>set=new LinkedHashSet<>();
        set.add(10);
        set.add(90);
        set.add(40);
        set.add(50);
        set.add(50);
        System.out.println(set);
        System.out.println(set.isEmpty());

        List<Integer>arr=new ArrayList<>(Arrays.asList(2,5,2,6,5,4,8));
        Set<Integer>set1=new LinkedHashSet<>(arr);
        System.out.println(set1);

        List<Integer>set2=new ArrayList<>(set1);
        Collections.sort(set2);
        System.out.println(set2);
    }
}
