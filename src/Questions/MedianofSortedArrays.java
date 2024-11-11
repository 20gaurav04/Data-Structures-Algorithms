package Questions;
//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
import java.util.Arrays;

public class MedianofSortedArrays {
    public static void main(String[] args) {
        int [] n1 =  {1,3};
        int [] n2 = {2};
        int [] res = medianOfTwo(n1,n2);
        System.out.println(Arrays.toString(res));
    }
    static int[] medianOfTwo(int[] n1,int[] n2) {
        int[] merged = new int[n1.length + n2.length];
        for (int i = 0; i < n1.length; i++) {
            merged[i] = n1[i];
        }
        for (int j = 0; j < n2.length; j++) {
            merged[n1.length + j] = n2[j];
        }
        return merged;

    }
}
