package Questions;

public class RotatedBSinDuplicateArray {
    public static void main(String[] args) {
        int [] arr ={2,9,2,2,2};
        int target = 9;
        System.out.print(findPivot(arr));
    }

    static int search(int [] nums,int target)
    {
        {
            int pivot = findPivot(nums);
            if(pivot==-1)
            {
                return BinarySearch(nums,target,0,nums.length-1);
            }
            if(nums[pivot]==target)
            {
                return pivot;
            }

            if(target>=nums[0])
            {
                return BinarySearch(nums,target,0,pivot-1);
            }
            return BinarySearch(nums,target,pivot+1,nums.length-1);

        }
    }

    static int BinarySearch(int [] arr , int target  , int start , int end)
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

    static int findPivot(int [] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                if (nums[mid] > nums[mid + 1]) {
                    return start;
                }
                start++;
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            else if(nums[start]<nums[mid] || (nums[start] == nums[mid] && nums[mid]>nums[end]))
            {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
    }
}
