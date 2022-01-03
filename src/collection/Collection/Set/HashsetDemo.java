package collection.Collection.Set;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {
    public static void main(String[] args) {
        Set<String>set1=new HashSet<String>();
        set1.add("B");
        set1.add("c");
        set1.add("b");
        set1.add("d");
        System.out.println(set1);

        Set<String>set2=new HashSet<>(Arrays.asList("a","b","c","e","f","m"));
        System.out.println(set2);

        Set<String>set3=new HashSet<>(set1);
        set3.addAll(set2);
        System.out.println(set3);

        set2.retainAll(set1);
        System.out.println(set2);

    }
}
