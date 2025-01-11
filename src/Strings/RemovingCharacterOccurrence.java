package Strings;

public class RemovingCharacterOccurrence {
    public static void main(String[] args) {
        String str = "abccdeedaccad";
        StringBuilder s  = function(str);
        System.out.println(s);

    }
    static StringBuilder function(String str)
    {
        StringBuilder s = new StringBuilder();
        for(char c : str.toCharArray())
        {
            if(c!='a')
            {
                s.append(c);
            }
        }
        return s;
    }
}
