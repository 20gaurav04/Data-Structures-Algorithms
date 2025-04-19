package Basics;
import java.util.*;

public class LargestTill0 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int sum = 0;
            int largest = Integer.MIN_VALUE;
            while(true)
            {
                int a = sc.nextInt();
                if(a==0) break;
                if(largest<a) largest = a;
            }
            System.out.print(largest);

    }
}

