package Questions;

public class SubArraySumHalf {
    public static void main(String[] args) {
        int [] arr = { 0,0,0,0};
//        we want the count of sub-array whose middle element is twice the sum of
//        first and third
//        for ex if arr is 1 4 1 then count is 1 as 1+1 == 4/2;

        int count = 0;

        for(int i = 0 ; i<=arr.length-3 ; i++)
        {
            count += arr[i] + arr[i+2] == arr[i+1] / 2.0 ? 1 : 0;
        }
        System.out.println("Total sub-arrays are : " + count);
//        tc = O(N)
//        sc = O(1)
    }
}
