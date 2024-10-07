package Questions;

public class FindRotationsOfArray {
    public static void main(String[] args) {
        int arr[] = { 6,7,8,2,3,4};
        System.out.print(countRotations(arr));
    }
    static int countRotations(int [] arr)
    {
        int pivot = findPivot(arr);
        return pivot +1;
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
