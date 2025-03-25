package Strings;
import java.util.*;

public class TotalPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char [] ar = s.toCharArray();
        List<String> lst = new ArrayList<>();
        perm(ar,0,lst);
        for(String n : lst)
        {
            System.out.println(n);
        }

    }

    static void perm(char ar[] , int ind , List<String> lst)
    {
        if(ind == ar.length)
        {
            lst.add(new String(ar));
            return;
        }
        for(int i = ind ; i<ar.length ; i++)
        {
            swap(ar,i,ind);
            perm(ar,ind+1,lst);
            swap(ar,i,ind);
        }
    }
    static void swap(char ar[] , int i , int j)
    {
        char c = ar[i];
        ar[i] = ar[j];
        ar[j] = c;
    }
}
