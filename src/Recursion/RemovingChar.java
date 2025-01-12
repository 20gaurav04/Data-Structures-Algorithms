package Recursion;

public class RemovingChar {
    public static void main(String[] args) {
        String s = "abcabcabc";
        String x = "";
        skip(s,x);
    }
    static void skip(String s , String x)
    {
        if(s.isEmpty())
        {
            System.out.println(x);
            return;
        }
        char ch = s.charAt(0);

        if(ch=='b')
        {
            skip(s.substring(1),x);
        }
        else
        {
            skip(s.substring(1),x+ch);
        }
    }
}
