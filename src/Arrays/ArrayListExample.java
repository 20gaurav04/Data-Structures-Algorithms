package Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(8);

//        list.add(5);
//        list.add(64);
//        list.add(423);
//        list.add(35);
//        list.add(352);


        for(int k= 0;k<9;k++)
        {
            System.out.print("Enter the next element to add in the list:");
            list.add(sc.nextInt());
        }
//        for(int i = 0 ; i<6 ; i++)
//        {
//            System.out.println(list.get(i)+" ");
//        }
//        System.out.println(list);

//        list.remove(1);/
//        list.add(3,42);

//        System.out.println(list);
    }
}
