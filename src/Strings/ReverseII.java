package Strings;


public class ReverseII {
    public static void main(String[] args) {
        String s = "hello world";
        String res = rev(s);
        System.out.println(res);
    }
    static String rev(String s)
    {
        StringBuilder r = new StringBuilder(s);
        r.reverse();

        String[] words = r.toString().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1 ; i>=0;i--)
        {
            sb.append(words[i]);
            if(i>0)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
