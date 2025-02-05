package Recursion;
import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

public class PhonePad {
    public static void main(String[] args) {
        List<String> res = pad("","12");
        System.out.println(res);

    }
    static List<String> pad(String p , String up)
    {
        List<String> res = new ArrayList<>();
        if (up.isEmpty()) {
            res.add(p);
            return res;
        }

        int digit = up.charAt(0) - '0';
        int start = (digit - 1) * 3;
        int end = digit * 3;

        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            res.addAll(pad(p + ch, up.substring(1)));
        }

        return res;
    }
}
