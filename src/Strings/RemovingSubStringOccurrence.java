package Strings;

public class RemovingSubStringOccurrence {
    public static void main(String[] args) {
        String s = "axyxxxyyyyb";
        String part = "xy";
        String res = removeOccurrence(s , part);
        System.out.println(res);
    }
    static String removeOccurrence(String s , String part)
    {
        StringBuilder res = new StringBuilder(s);

        int index;

        while((index = res.indexOf(part))!=-1)
        {
            res.delete(index,index+part.length());
        }
        return res.toString();
    }
}
