package Arrays;

public class MissingEle {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        fun(arr);
        System.out.println(arr);
    }
    static void fun(int[] arr)
    {
        int i =0;
        while(i<arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
    static void swap(int [] arr ,int first,int second)
    {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}