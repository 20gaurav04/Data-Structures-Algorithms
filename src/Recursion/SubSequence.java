package Recursion;

public class SubSequence {
    public static void main(String[] args) {
        String processed = "abc";
        String unprocessed = "";
        SubSeq(processed,unprocessed);

    }
    static void SubSeq(String p , String up)
    {
        if(p.isEmpty())
        {
            System.out.println(up);
            return;
        }
        char ch = p.charAt(0);

        SubSeq(p.substring(1),up+ch);
        SubSeq(p.substring(1),up);
    }
}
