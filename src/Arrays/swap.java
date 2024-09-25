package Arrays;
import java.util.Scanner;
import java.util.Arrays;


public class swap {
    public static void main(String[] args) {
        int [] arr = new int [5];
        Input(arr);
        change(arr,2,4);

    }
    static void Input(int[] arr)
    {
        for(int i =0;i<5;i++)
        {
            System.out.print("input elements:");
            Scanner in = new Scanner(System.in);
            arr[i] = in.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        System.out.println(" ");

    }
    static void change(int[] arr, int x,int y)
    {
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
        System.out.println("After swapping: "+Arrays.toString(arr));
    }

}
