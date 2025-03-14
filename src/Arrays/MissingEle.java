package Arrays;

import java.util.Arrays;

public class MissingEle {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        fun(arr);
        System.out.println(Arrays.toString(arr)); // Correct way to print an array
    }

    static void fun(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) { // Check bounds before accessing
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}