package collection.Collection.Practice;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {
    public static void main(String[] args) {
        Queue<Integer>queue=new PriorityQueue<>(Arrays.asList(1,2,5,2,4,6,9,2));

        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
