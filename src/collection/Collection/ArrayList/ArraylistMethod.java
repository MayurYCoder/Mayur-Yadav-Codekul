package collection.Collection.ArrayList;

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
        list2.add(6);
        list2.add(6);
        list2.add(8);
        list2.add(8);
        list2.add(5);

        //list1.addAll(list2);
        //System.out.println(list1.toArray());

        //list1.removeIf(num->num%2==0);
         list1.retainAll(list2);
        //list1.removeAll(list2);
        System.out.println(list1);

       /*

        ArrayList<String >ar=new ArrayList<String >();
        ar.add("java");
        ar.add("python");
        ar.add("javascript");
        ar.add("HTML");
        ar.add("CSS");

        ArrayList<String >ar2=new ArrayList<String >();
        ar2.add("SPring");
        ar2.add("Hibernate");

        ar.addAll(2,ar2);
        System.out.println(ar);

        ArrayList<String > clone=(ArrayList<String >)ar.clone();
        System.out.println(clone);
        System.out.println(ar.indexOf("HTML"));
        System.out.println(ar.get(5));
        System.out.println(ar.remove("CSS"));
        System.out.println(ar);
        System.out.println( ar.lastIndexOf("HTML"));
        */
    }
}
