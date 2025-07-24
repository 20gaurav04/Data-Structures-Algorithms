package StacksAndQueues;
import java.util.*;

public class ReverseStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(5);
        s1.push(4);
        s1.push(2);
        s1.push(6);
        System.out.println("Before Reversing" + " " + s1);
        reverse(s1);
        System.out.println("After Reversing" + " " + s1);
    }
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top = s.peek();
        s.pop();

        reverse(s);
        insertAtBottom(s,top);
    }
    private static void insertAtBottom(Stack<Integer> s , int n)
    {
        if(s.isEmpty())
        {
            s.push(n);
            return;
        }
        int top = s.pop();
        insertAtBottom(s, n);
        s.push(top);
    }
}
