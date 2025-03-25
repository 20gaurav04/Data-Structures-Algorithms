package Strings;
import java.sql.SQLOutput;
import java.util.*;

public class LongestHappyPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder res = new StringBuilder("Afsar ");
        System.out.println(res.insert(3,"faruk"));
        String b = "",c="";
        int l = s.length();
        int i = 0;
        while(i<l-1)
        {
            b+=s.charAt(i);
            res.insert(0,s.charAt(l-i-1));
            if(b.equals(res.toString())) {
            c=b;
            }
            i++;
        }
        System.out.println(c);
    }
}
