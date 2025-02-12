package Strings;

public class MergeAlternateStrings {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "pqrs";
        String res = merge(s1, s2);
        System.out.println(res);

    }

    static String merge(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int m = word1.length();
        int n = word2.length();

        int i = 0, j = 0;

        while (i < m || j < n) {
            if (i < m) res.append(word1.charAt(i++));
            if (j < n) res.append(word2.charAt(j++));

        }
        return res.toString();
    }
}