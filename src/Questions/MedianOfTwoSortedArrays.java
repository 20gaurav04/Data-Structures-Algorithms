package Questions;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3};
        double median = medianOfArrays(nums1,nums2);
        System.out.println(median);
    }
    static double medianOfArrays(int[] n1 , int[] n2)
    {
        int[] n3 = new int[n1.length + n2.length];
        System.arraycopy(n1 , 0 , n3 ,  0 , n1.length);
        System.arraycopy(n2 , 0 , n3 ,  n1.length, n2.length);

        int len = n3.length;

        if(len % 2 == 1) return (double) n3[len/2];

        return (double) n3[len/2 - 1] + n3[len/2 + 1] / 2.0;

    }
}
