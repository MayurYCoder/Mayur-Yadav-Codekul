package collection.Collection.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
 /*       TreeSet<String>set=new TreeSet<>();
        set.add("Sonu");
        set.add("ganu");
        set.add("Somu");
        set.add("Monu");
        System.out.println(set);
        set.forEach(s->{
            System.out.println(s);
        });
 */

        TreeSet<Integer>set1=new TreeSet<>();
        set1.add(10);
        set1.add(60);
        set1.add(40);
        set1.add(20);
        System.out.println(set1.floor(21));    //it gives the same or previous value
        System.out.println(set1.ceiling(21));   //it gives the same or next value.
        System.out.println(set1.higher(20));    //it gives the next value
        System.out.println(set1.lower(10));     //it gives the previous value
    }
}
