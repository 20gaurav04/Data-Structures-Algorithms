package Questions;
import java.util.*;
//https://leetcode.com/problems/flipping-an-image/description/

public class FlippingImage {
    public static void main(String[] args) {
        int [] [] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
    static int[][] flipAndInvertImage(int[][] image)
    {
        for(int[] row : image)
        {
            int left = 0,right=row.length-1;
            while(left<=right)
            {
                int temp = row[left];
                row[left++]=row[right]^1;
                row[right--]=temp^1;
            }
        }
        return image;
    }
}
