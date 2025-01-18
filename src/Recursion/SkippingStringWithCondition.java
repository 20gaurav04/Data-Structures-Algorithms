package Recursion;

public class SkippingStringWithCondition {
    public static void main(String[] args) {
        String s = "redappe";
        String res = skip(s);
        System.out.println(res);

    }
    static String skip(String s)
    {
        if(s.isEmpty())
        {
            return "" ;
        }
        if(s.startsWith("app") && !s.startsWith("apple"))
//        it will skip app only when it is not applez
        {
            return skip(s.substring(3));
        }
        else
        {
            return s.charAt(0)+skip(s.substring(1));
        }
    }
}
