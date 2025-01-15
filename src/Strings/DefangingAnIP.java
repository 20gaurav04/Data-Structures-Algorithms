package Strings;

public class DefangingAnIP {
    public static void main(String[] args) {
        String s = "1.1.1.1";
        String res = defang(s);
        System.out.println(res);
    }

    static String defang(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '.') {
                res.append("[.]");
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}
