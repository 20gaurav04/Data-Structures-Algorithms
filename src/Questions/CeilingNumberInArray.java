package Questions;
//
public class CeilingNumberInArray {
    public static void  main(String[]args)
    {
        int[] arr = {56,50,49,44,23,12,10};
//        int[] arr = {10,12,23,44,49,50,56};
//        Trying to return smallest number greater than or equal to target
        int target =50;
        int ans = Ceiling(arr,target);
        System.out.print(ans);
    }
    static int Ceiling(int[] arr,int target)
    {
//        if(target>arr.length-1)
//        {
//            return -1;
//        }
        int start = 0;
        int end  = arr.length-1;

        boolean isAscending = arr[start]<arr[end];

        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(isAscending)
            {
                if(target>arr[mid])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid -1;
                }
            }
            else
            {
                if(target<arr[mid])
                {
                    start = mid +1;
                }
                else
                {
                    end = mid-1;
                }
            }
        }
//        if the target is not found and we have to return the smallest number greater than target , it means start exceeds end now;
        return start;
    }
}
