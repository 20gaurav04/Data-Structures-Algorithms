package Questions;

public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = { 1,3,5,6,8,33,55,69,95,220,550,999,1024,9999};
        int target=95;
        int ans = answ(arr,target);
        System.out.print(ans);


    }
    static int answ(int[] arr,int target)
    {
        int start =0;
        int end =1;
        while(target>arr[end])
        {
            int temp =end+1;
            end = end +(end - start+1)*2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr , int target , int start , int end)
    {
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(target<arr[mid])
            {
                end = mid -1;
            }
            else if (target>arr[mid])
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
