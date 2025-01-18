package Strings;

public class StringAppearAsSubString {
    public static void main(String[] args) {
        String [] patterns = {"a","abc","bc","d"};
        String word = "abc";
        int res = appearance(patterns,word);
        System.out.println(res);
    }
    static int appearance(String[] pattern , String s)
    {
        int appearance = 0;
        int len = pattern.length;
        for(int i = 0; i<len;i++)
        {
            if(s.contains(pattern[i]))
            {
                appearance++;
            }
        }
        return appearance;
    }
}
