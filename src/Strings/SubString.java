package Strings;

public class SubString {

    public static void main(String[] args) {
        String s = "abcdefgbcfbc";
        String s1 = "bc";
        int res = countSubstr(s,s1);
        System.out.println(res);
    }
    static int countSubstr(String s, String sub) {      // S1
        int count = 0;                                  // S2
        for (int i = 0; i <= s.length() - sub.length(); i++) { // S3
            if (s.startsWith(sub, i)) // S4
                count++;                                 // S5
        }
        return count;                                    // S6
    }

}
