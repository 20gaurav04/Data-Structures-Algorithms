package OOPS.Collections;
import java.util.*;

public class Collections {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new LinkedList<>();
        List<Integer> l3 = new Vector<>();

//        all are part of collections framework as they call contains the same methods
//        vectors are synchronised means if 1 thread is accessing resources then
//        other one must wait making it slow then arraylist in which concurrent access is there
        l1.add(2);
        l2.add(4);
        l3.add(5);
        System.out.println(l1 + " " + l2 + " " + l3);

    }
}
