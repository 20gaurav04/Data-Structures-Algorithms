package Strings;
//https://leetcode.com/problems/goal-parser-interpretation/submissions/1509541976/

public class GoalParser {
    public static void main(String[] args) {
        String s = "G()(al)";
        String res = parse(s);
        System.out.println(res); // Output should be "Goal"
    }

    static String parse(String command) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            char ch = command.charAt(i);
            if (ch == 'G') {
                res.append('G'); // Append 'G' directly
            } else if (ch == '(' && command.charAt(i + 1) == ')') {
                res.append('o'); // Handle "()"
                i++; // Skip the next character
            } else if (ch == '(') {
                res.append("al"); // Handle "(al)"
                i += 3; // Skip the next three characters
            }
        }

        return res.toString();
    }
}
