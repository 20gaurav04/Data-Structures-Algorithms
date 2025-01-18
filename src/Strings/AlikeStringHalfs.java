package Strings;

public class AlikeStringHalfs {
    public static void main(String[] args) {
        String s = "Two";
        boolean res = alike(s);
        System.out.println(res);
    }
    static boolean alike(String s )
    {
        int countFirstHalf = 0;
        int countSecondHalf = 0;
        for(int i = 0 ; i<s.length()/2; i++)
        {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='o'|| ch=='i' || ch=='u' || ch=='I' || ch=='A' || ch=='O' || ch=='U' || ch=='E')
            {
                countFirstHalf ++;
            }

        }
        for(int j = s.length()/2;j<s.length();j++)
        {
            char c = s.charAt(j);
            if(c=='a' || c=='e' || c=='o' || c=='i' || c=='u' || c=='A' || c=='I' || c=='U' || c=='O' || c=='E')
            {
                countSecondHalf ++;
            }
        }
        return countFirstHalf==countSecondHalf;
    }
}
