package org.tfoc;

public class Main {
    public static void main(String[] args) {

        MinStack minStack = new MinStack();

        minStack.push(8);
        minStack.push(3);
        minStack.push(1);
        minStack.push(9);
        minStack.push(0);
        minStack.push(12);

        System.out.println("TOP: " + minStack.top());
        System.out.println("MIN: " + minStack.getMin());

        minStack.pop();
        minStack.pop();

        System.out.println("TOP: " + minStack.top());
        System.out.println("MIN: " + minStack.getMin());

        minStack.pop();
        minStack.pop();

        System.out.println("TOP: " + minStack.top());
        System.out.println("MIN: " + minStack.getMin());



    }
}
