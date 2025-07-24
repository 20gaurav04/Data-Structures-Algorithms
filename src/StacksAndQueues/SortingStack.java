package StacksAndQueues;

import java.util.Stack;

public class SortingStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(5);
        s1.push(4);
        s1.push(2);
        s1.push(6);
        System.out.println("Before sorting" + " " + s1);
        sort(s1);
        System.out.println("After sorting" + " " + s1);
    }
    static Stack<Integer> sort(Stack<Integer> s) {
        if(s.isEmpty())
        {
            return s;
        }
        int top = s.peek();
        s.pop();
        sort(s);
        sortedInsert(s,top);
        return s;
    }
    static void sortedInsert(Stack<Integer> s,int n)
    {
        if((s.isEmpty()) || (s.peek()<n) && (!s.isEmpty()))
        {
            s.push(n);
            return;
        }
        int top = s.peek();
        s.pop();
        sortedInsert(s,n);
        s.push(top);
    }
}
