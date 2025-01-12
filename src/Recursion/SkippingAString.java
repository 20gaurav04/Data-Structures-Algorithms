package Recursion;

public class SkippingAString {
    public static void main(String[] args) {
        String s = "gauravisgreat";
        String res = skip(s);
        System.out.println(res);
    }
    static String skip(String s)
    {
        if(s.isEmpty())
        {
            return " ";
        }
        if(s.startsWith("gaurav"))
        {
            return skip(s.substring(6));
        }
        else
        {
            return s.charAt(0) + skip(s.substring(1));
        }
    }
}
