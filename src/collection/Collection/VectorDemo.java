package collection.Collection;


import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        System.out.println(vector.capacity());
        System.out.println(vector.remove(3));
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.remove(2));
        System.out.println(vector.elementAt(1));
        System.out.println(vector.size());

        ListIterator listIterator=vector.listIterator(vector.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.hasPrevious());
        }
    }
}
