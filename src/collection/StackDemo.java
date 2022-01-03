package collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
      stack.push(10);
      stack.push(20);
      stack.push(30);
      stack.push(40);

        System.out.println(stack.peek());//return head
        System.out.println(stack.pop());//remove head and print.
        System.out.println(stack.search(Integer.valueOf(10)));
        System.out.println(stack);
        System.out.println(stack);

    }
}
