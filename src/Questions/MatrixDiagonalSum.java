package Questions;
//https://leetcode.com/problems/matrix-diagonal-sum/description/

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {7,3,1,9},
                {3,4,6,9},
                {6,9,6,6},
                {9,5,8,5}
        };
        System.out.println(diagonalSum(matrix));
    }
    static int diagonalSum(int[][] matrix)
    {
        int row = matrix.length;
        int sum=0;
        for(int i =0;i<row;i++)
        {
            sum+=matrix[i][i];
            sum+=matrix[i][row-i-1];

            if(row%2!=0)
            {
                sum-=matrix[row/2][row/2];
            }
        }
        return sum;
    }
}
