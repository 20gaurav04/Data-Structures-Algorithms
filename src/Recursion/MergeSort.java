package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 14, 6, 88, 2};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergeSort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int len = arr.length;
        int mid = len/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,len));

        return merge(left,right);
    }
    static int[] merge (int[] left , int[] right)
    {
        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                mix[k] = left[i];
                i++;
            }
            else
            {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
//might be possible that one of the arrays might not be complete so one of the loops would run.
        while(i<left.length)
        {
            mix[k] = left[i];
            i++;
            k++;
        }

        while(j<right.length)
        {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
