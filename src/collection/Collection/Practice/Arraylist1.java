package collection.Collection.Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist1 {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(105);
        list.add(103);
        list.add(10);
        list.add(101);

        System.out.println(list);

        list.forEach(s->{
            System.out.println(s);
        });

        Iterator<Integer>iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (int i:list){
            System.out.println(i);
        }
    }
}
