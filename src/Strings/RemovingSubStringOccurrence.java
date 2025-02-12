package Strings;
//https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/
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
//        indexOf takes the first occurrence of the part in the res;
//            so, in the first iteration index will be 4 as xy as complete occurring at 4
        {
            res.delete(index,index+part.length());
        }
        return res.toString();
    }
}
