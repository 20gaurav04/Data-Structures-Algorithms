package Basics;

import java.lang.Math;
import java.util.*;
class AllPrimes{
    public static void main(String[] args) {
        int start = 5;
        int end = 100;
        // ArrayList<Integer> lst  = new ArrayList<>();
        System.out.println(allPrimes(start,end));
    }

    static List<Integer> allPrimes(int start , int end)
    {
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = start ; i<=end;i++)
        {
            if(isPrime(i))
            {lst.add(i);}
        }
        return lst;
    }
    static boolean isPrime(int r)
    {
        int c = 2;
        while(c*c<=r)
        {
            if(r%c==0) return false;
            c++;
        }
        return true;
    }
}