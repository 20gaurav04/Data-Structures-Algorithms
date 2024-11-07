package BitwiseOperators;
import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num to check : ");
          int number = sc.nextInt();
        System.out.print(check(number));
    }
    static String check(int num)
    {
        if((num & 1) == 0)
        {
            return "even";
        }
        return "odd";
    }
}
