package collection.Collection.Practice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class ArrayDeQ {
    public static void main(String[] args) {
        Queue<Integer>queue=new ArrayDeque<>(Arrays.asList(2,1,5,4,8,9,2));
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue.getClass());
        System.out.println(queue);
    }
}
