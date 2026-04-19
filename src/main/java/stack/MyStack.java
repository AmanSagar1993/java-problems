package src.main.java.stack;

import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.peek();
        System.out.println(stack);
    }
}
