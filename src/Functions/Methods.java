package Functions;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        String name = details();
        System.out.println(name);
        int mark = marks(24,56);
        System.out.println(mark);
    }
    static String details()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your student");
        String names = sc.nextLine();
        return names;
    }

    static int marks(int a, int b)
    {
        int marks = a + b;
        return marks;
    }
}