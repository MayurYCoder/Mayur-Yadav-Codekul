package collection.ArrayList;
/*
arraylist maintain instertion order
arraylist maintain
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayLIstDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
/*        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.remove(2));
        System.out.println(list.set(1,20));
        System.out.println(list.contains(10));

*/        list.forEach(s->{
            System.out.println(s);
        });

        Iterator<Integer>iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    /*    List<Integer> list1= Arrays.asList(10,20,22,22,32,51);

        List<Integer> list2=new ArrayList<>(List.of(10,20,12,11,20));

        List<Integer> list3=new ArrayList<>(){{
            add(10);
            add(150);
            add(50);
            add(20);
        }};

        List<Integer> list4=new ArrayList<>(Arrays.asList(21,22,54,78,99));

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);


     */

    }
}
