package Recursion;

public class find {
    static boolean find(int[] arr , int index , int target)
    {
        if(index==arr.length) return false;

        return arr[index]==target || find(arr,index+1,target);

    }

    public static void main(String[] args) {
        int [] arr =  { 1,2,3};
        int target = 3;
        boolean res = find(arr,0,target);
        System.out.println(res);

    }
}
