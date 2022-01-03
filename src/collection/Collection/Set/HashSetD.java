package collection.Collection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetD {
    public static void main(String[] args) {
      /*  Set<String >hs=newHashSet<>();
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

        Set<Integer> hs=new HashSet<>(Arrays.asList(1,2,5,6,0,4,8,9));
        Set<Integer> hs1=new HashSet<>(Arrays.asList(1,2,3,5,6,13));
        Set<String> set1= new HashSet<>(Arrays.asList("a","b","c","d"));
        System.out.println();

        //add all is like union add without repeating
       // hs1.addAll(hs);
        System.out.println(hs1);

        //retain all is like intersection only common elements
       Set<Integer>hs2=new HashSet<>(hs1);
       hs1.retainAll(hs1);
       System.out.println(hs1);


    }
}
