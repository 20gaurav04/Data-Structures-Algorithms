package LinearSearch;
import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args)
    {
        int [] arr = new int [5];
        inputs(arr);
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter the searching element: ");
        x=sc.nextInt();
        int searchingElement = find(arr,x);
        System.out.println("Searching element found at index :"+" "+searchingElement);
    }
    static void inputs(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    static int find(int[] arr ,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            int element  = arr[i];
            if(element==target)
            {
                return i;
            }
        }return -1;
    }
}

