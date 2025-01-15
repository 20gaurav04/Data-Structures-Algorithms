package Recursion;
import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String processed = "";
        String unprocessed = "abc";
//        SubSeq(processed,unprocessed);
        System.out.println(function(processed,unprocessed));
    }
    static void SubSeq(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        SubSeq(p+ch,up.substring(1));
        SubSeq(p,up.substring(1));
    }
    static ArrayList<String> function(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = function(p+ch,up.substring(1));
        ArrayList<String> right = function(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
