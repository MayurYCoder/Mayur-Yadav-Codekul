package collection.Collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<String >name=new LinkedList<String >();
        System.out.println(name.size());
        name.add("Maddy");
        name.add("haddy");
        name.add("saddy");
        System.out.println(name.size());

        Iterator<String >iterator=name.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        LinkedList<String>name1=new LinkedList<String >();
        name1.add("Trump");
        name1.add("kamala");

        name.addAll(name1);
        System.out.println(name);

        name.addLast("Gani");
        name.addFirst("jani");
        System.out.println(name);

        Iterator<String >itr=name.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
