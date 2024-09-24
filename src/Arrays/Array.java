package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array
{
    public static void main(String [] args)
    {
//        int [] roll = {1,3,4,5,6,7};
//        System.out.println(Arrays.toString(roll));
        String [] arr = new String[5];

        for(int i = 0; i < 5; i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array element: ");
            arr[i] = sc.next();
        }
        for(String val:arr)
        {
            System.out.print(val+" ");
        }
    }
}
