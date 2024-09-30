package LinearSearch;

public class minInArray {
    public static void main(String[] args) {
        int [] arr = {4,56,74,-35,2,32};
        System.out.print(min(arr));
    }
    static int min(int arr[])
    {
        if(arr.length==0)
            return -1;
        int small = arr[0];
        for(int i = 0 ; i<arr.length;i++)
        {
            if(small>arr[i])
            {
                small=arr[i];
            }
        }
        return small;
    }
}
