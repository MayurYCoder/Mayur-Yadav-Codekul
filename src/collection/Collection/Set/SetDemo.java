package collection.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set);

        Set<Integer>set1=new HashSet<>();
        set1.add(30);
        set1.add(80);
        set1.add(10);
        set1.add(320);
        set.contains(set1);
        System.out.println(set1);

//treeset will give output in the ascending order
        Set<Integer>set2=new TreeSet<>();
        set2.add(10);
        set2.add(70);
        set2.add(40);
        set2.add(50);
        System.out.println(set2);

//linked hashset will maintain the input order.
        Set<Integer>set3=new LinkedHashSet<>();
        set3.add(10);
        set3.add(20);
        set3.add(70);
        set3.add(40);
        System.out.println(set3);
    }
}
