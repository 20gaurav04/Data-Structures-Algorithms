package Strings;
//https://leetcode.com/problems/shuffle-string/

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String res = restoreString(s,indices);
        System.out.println(res);
    }
    static String restoreString(String s , int [] indices)
    {
        StringBuilder res = new StringBuilder();

        int len = indices.length;

        for(int i = 0; i<len;i++)
        {
           char ch = s.charAt(indices[i]);
           res.append(ch);
        }
        return res.toString();
    }
}
