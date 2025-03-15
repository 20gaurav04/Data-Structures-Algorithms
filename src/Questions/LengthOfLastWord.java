package Questions;
//https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
    public static void main(String[] args) {
       String s = "fly me to the moon";
       int res = lengthOfLastWord(s);
        System.out.println(res);

    }
    static int lengthOfLastWord(String s)
    {
                int len = 0;
                int i = s.length() - 1;

                // Trim trailing spaces
                while (i >= 0 && s.charAt(i) == ' ') {
                    i--;
                }

                // Count the length of the last word
                while (i >= 0 && s.charAt(i) != ' ') {
                    len++;
                    i--;
                }

                return len;

    }
}
