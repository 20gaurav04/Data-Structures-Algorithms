
import java.util.Scanner;
public class CountNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        long a = sc.nextInt();

        int count = 0;
        while(a>0) {
            long rem = a%10;
            if (rem == 7) {
                count++;
            }
            else{
                count =0;
            }
            a = a / 10;
        }System.out.print("val"+count);



    }
}