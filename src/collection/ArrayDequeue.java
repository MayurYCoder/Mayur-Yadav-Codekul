package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        deque.offer(20);    //it is also add the element.
        //     System.out.println(deque.removeFirst());          //used to remove first element.
        //    System.out.println(deque.poll());                  //used to remove head when input is not given the provide null.
        //     System.out.println(deque.remove());               //used to remove head when input is not given the provide exception.
        //     System.out.println(deque.peek());                 //return head.
        //    System.out.println(deque.pop());                  //return removed head.
        //     System.out.println(deque.pollFirst());         //remove first head
        //   System.out.println(deque.pollLast());          //remove last head
        System.out.println(deque.peekLast());         //it only return last head
        System.out.println(deque.peekFirst());        //it only return first head
        System.out.println(deque);
    }
}
