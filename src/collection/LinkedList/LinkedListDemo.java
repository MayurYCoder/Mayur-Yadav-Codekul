package collection.LinkedList;
/*   linked list stores .

 */

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer>list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.get(2));
        System.out.println(list.set(1,50));
        System.out.println(list.size());
        System.out.println(list.remove(3));
        System.out.println(list.indexOf(40));
    }
}
