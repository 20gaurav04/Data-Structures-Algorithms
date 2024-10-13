package BinarySearch;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int [][] Matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,45},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(Matrix,37)));
    }
    static int[] search(int[][]Matrix , int target)
    {
        int row = 0;
        int col = Matrix.length-1;

        while(row<=Matrix.length && col>=0)
        {
            if(Matrix[row][col]==target)
            {
                return new int[]{row,col};
            }
            if(Matrix[row][col]<target)
            {
                row++;
            }
            else
            {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
