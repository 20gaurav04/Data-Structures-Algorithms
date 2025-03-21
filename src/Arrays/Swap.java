package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Input(arr);
        change(arr, 2, 4);
    }

    static void Input(int[] arr) {
        Scanner in = new Scanner(System.in);  // Scanner should be created once
        for (int i = 0; i < 5; i++) {
            System.out.print("Input element: ");
            arr[i] = in.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
    }

    static void change(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        System.out.println("After swapping: " + Arrays.toString(arr));
    }
}