package Recursion;
import java.util.Arrays;
public class inPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        // In-place merge logic directly here
        int i = start;
        int j = mid;
        int k = 0;

        int[] mix = new int[end - start];

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i < mid) {
            mix[k++] = arr[i++];
        }

        while (j < end) {
            mix[k++] = arr[j++];
        }

        // Copy back to original array
        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
    }
}

