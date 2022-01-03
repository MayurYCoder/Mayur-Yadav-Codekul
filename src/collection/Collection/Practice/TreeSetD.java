package collection.Collection.Practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetD {
    public static void main(String[] args) {
        Set<String>str=new TreeSet<>(Arrays.asList("Mayur","Ganya","Sonys","Monya","Mayur"));
        str.add("Danny");
        str.remove("Tayur");
        str.toArray();
        System.out.println(str);

    }
}
