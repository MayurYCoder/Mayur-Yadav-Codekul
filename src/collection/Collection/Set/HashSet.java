package collection.Collection.Set;

import java.util.Arrays;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
      /*  Set<String >hs=new java.util.HashSet<>();
        hs.add("Tiger");
        hs.add("lion");
        hs.add("cow");
        hs.add("cow");
        System.out.println(hs.contains("cow"));

        for (String e:hs) {
            System.out.println(e);
        }
        System.out.println(hs.remove("cow"));
        System.out.println(hs);
       */

        Set<Integer> hs=new java.util.HashSet<>(Arrays.asList(1,2,5,6,0,4,8,9));
        Set<Integer> hs1=new java.util.HashSet<>(Arrays.asList(1,2,3,5,6,13));

        //add all is like union add without repeating
        Set<Integer> union=new java.util.HashSet<Integer>(hs);
        union.addAll(hs1);
        System.out.println(union);

        //retain all is like intersection only comman elements
        Set<Integer>intersection=new java.util.HashSet<>(hs);
        intersection.retainAll(hs1);
        System.out.println(intersection);


    }
}
