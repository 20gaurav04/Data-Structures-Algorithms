package StacksAndQueues;
import java.util.*;

public class Queues {

//    queue is an interface in java because it let's you decide how you actually wants to implement it whether as a list or
//    deque or priority queue , it's up to the user.
    public static void main(String[] args) {
        Queue<Integer> s = new LinkedList<>();

        s.add(1);
        s.add(2);
        s.add(4);
        s.add(3);
        s.add(5);
        System.out.println(s.remove());
//        removes the first elements as it works on FIFO logic.

        System.out.println(s.poll());
//        poll removes the head and returns null if empty whereas
//        remove() would return NoSuchElementException
        System.out.println(s.peek());

    }
}


