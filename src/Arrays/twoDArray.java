package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class twoDArray {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
//        System.out.print(arr.length);
        for(int row=0;row<arr.length;row++)
        {
            for(int col= 0;col<arr[row].length;col++)
            {
                arr[row][col]=sc.nextInt();
            }
        }
        for(int[] a:arr)
        {
           System.out.print(Arrays.toString(a));
        }
        System.out.println();
    }
}
