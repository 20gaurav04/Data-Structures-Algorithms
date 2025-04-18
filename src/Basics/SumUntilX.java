package Basics;
import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(true)
        {
            String s = sc.next();
            if(s.equals("X")|| s.equals("x")) break;
            sum +=Integer.parseInt(s);
        }
        System.out.println(sum);
    }

}
