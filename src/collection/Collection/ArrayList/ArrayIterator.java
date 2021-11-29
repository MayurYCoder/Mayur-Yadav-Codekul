package collection.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {
    public static void main(String[] args) {
        ArrayList<Integer>ar=new ArrayList<Integer>();

        ar.add(50);
        ar.add(40);
        ar.add(30);
        ar.add(20);
        ar.add(10);
        System.out.println(ar);
        System.out.println("---------------");
        //using for loop.
        for (int i=0;i<=ar.size()-1;i++){
            System.out.println(ar.get(i));
        }
        System.out.println("---------------");

        //using for each
        for (int i:ar){
            System.out.println(i);
        }
        System.out.println("---------------");

        //using lamda function
        ar.forEach(s->{
            System.out.println(s);
        });
        System.out.println("---------------");

        //using iterator function
        Iterator<Integer> it=ar.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
