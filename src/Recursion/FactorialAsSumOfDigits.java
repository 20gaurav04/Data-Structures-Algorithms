package Recursion;
import java.io.*;
import java.util.*;

public class FactorialAsSumOfDigits {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            while(x!=0)
            {
                int n = sc.nextInt();
                find(n);
                x--;
            }
        }

        static int fact(int n)
        {
            if(n==0) return 1;

            return n * fact(n-1);
        }
        static void find(int n)
        {
            List<Integer> lst = new ArrayList<>();
            for(int i = 9;i>=0 ; i--)
            {
                while(n>=fact(i))
                {
                    n-=fact(i);
                    lst.add(i);
                }
            }
            Collections.sort(lst);
            for(int num : lst)
            {
                System.out.print(num);
            }
        }
    }
