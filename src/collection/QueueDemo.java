package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer>que=new PriorityQueue<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);



        System.out.println(que.peek());          //returns head or null
        System.out.println(que.remove());        //removes head in que
        System.out.println(que.element());       //returns head or exception
        System.out.println(que.offer(150));   // add value or return false
        System.out.println(que);
    }
}
