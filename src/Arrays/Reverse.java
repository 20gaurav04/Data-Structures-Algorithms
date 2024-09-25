package Arrays;
import java.util.Arrays;

public class Reverse {

    static void reverse(int [] arr)
    {
        int start=0;
        int end = arr.length-1;

        while(start<end)
        {
            change(arr,start,end);
            start++;
            end--;
        }

    }
    static void change(int[] arr, int x,int y)
    {
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
//        System.out.println("After swapping: "+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {4,34,5,63,22,95};
        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }
}
