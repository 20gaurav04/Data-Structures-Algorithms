package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int []arr = {1,2,8,3};
       boolean res =  sorted(arr,0);
        System.out.println(res);

    }
    static boolean sorted(int[] arr , int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
