package Strings;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
                char[] charArray = {'h', 'e', 'l', 'l', 'o'};
                StringBuilder sb = new StringBuilder(new String(charArray));
                char[] reversed = sb.reverse().toString().toCharArray();

                // Print the reversed array
                System.out.println(Arrays.toString(reversed)); // Output: [o, l, l, e, h]
            }
}
