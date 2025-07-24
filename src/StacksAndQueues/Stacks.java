package StacksAndQueues;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();

        System.out.println(s.peek());
        System.out.println(s.pop());
//        it will be pop 4 because it works on the LIFO principle.

    }
}
