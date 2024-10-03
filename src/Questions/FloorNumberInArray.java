package Questions;

public class FloorNumberInArray {
    public static void main(String[] args) {
//        Idea is to return the largest number which is lesser than or equal to the target;
        int [] arr = {40,50,60,70,80};
        int target=72;
        int ans = Floor(arr,target);
        System.out.print(ans);
//        it should return 70;
    }
    static int Floor(int[] arr , int target)
    {


        int start;
        start = 0;
        int end = arr.length-1;



        boolean isAsc= arr[start]<arr[end];

        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(isAsc)
            {
                if(target>arr[mid])
                {
                    start = mid+1;
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
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }
        }
        return end;
    }
}
