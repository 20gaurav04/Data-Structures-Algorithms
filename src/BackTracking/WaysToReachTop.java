package BackTracking;
import java.util.*;
import java.io.*;
public class WaysToReachTop {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
//        We can only move either left or up;

        System.out.println(allPaths(rows,cols));
    }
    static int allPaths(int rows , int cols)
    {
        if(rows==1 || cols==1)
        {
            return 1;
//            when we reach any of end , we return 1;
        }

        return allPaths(rows-1 , cols) + allPaths(rows , cols-1);
    }
}
