package Sorting;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = { 4,1,8,-3,0,44,2};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void BubbleSort(int[] arr)
    {
        boolean swapped = false;
        for(int i = 0 ; i<arr.length;i++)
        {
            for(int j = 1 ; j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
//            if swap is false for the 1st value of i , it means array is sorted
            if(!swapped)
            {
                break;
            }
        }
    }
}
