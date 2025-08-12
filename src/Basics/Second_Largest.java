package Basics;
import java.util.*;
public class Second_Largest {
    public static void main(String[] args)
    {
        int [] arr = {1, 2, 3, 4, 5,5};
        int second_largest = ans(arr);
        System.out.println(second_largest);
    }
    static int ans(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        for(int i : arr)
        {
            if(i>largest) largest = i;
        }
        int second_largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i] > second_largest && arr[i]<largest)
            {
                second_largest = arr[i];
            }
        }
        return second_largest;
    }
}
