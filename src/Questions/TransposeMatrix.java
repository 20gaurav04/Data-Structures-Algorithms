package Questions;
//https://leetcode.com/problems/transpose-matrix/description/

import java.util.*;

public class TransposeMatrix
{
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
    static int[][] transpose(int[][] A)
    {
        int row = A.length;
        int col= A[0].length;
        int[][] mat = new int[col][row];

        for(int i = 0 ;i<row ; i++)
        {
            for(int j =0;j<col;j++)
            {
                mat[j][i]=A[i][j];
            }
            System.out.println(" ");
        }
        return mat;
    }
}
