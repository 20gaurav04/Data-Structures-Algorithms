package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,8,9};
//        int[] arr = {9,4,3,2,-2,-5};
        int target=7;
        System.out.print(BS(arr,target));

    }
    static int BS(int [] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;

        boolean isAscending = arr[start] < arr [end];

        while(start<=end)
        {
        int mid = start + (end-start)/2;

        if(arr[mid]==target)
        {
            return mid;
        }
        if(isAscending)
        {
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        else{
            if(target>arr[mid])
            {
                end = mid -1;
            }
            else
            {
                start = mid+1;
            }
        }
        }
        return start;
    }
}
