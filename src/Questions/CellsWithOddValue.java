package Questions;
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

public class CellsWithOddValue {
    public static void main(String[] args) {
        int m =2;
        int n=3;
        int [][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));

    }
    static int oddCells(int m,int n,int[][] indices)
    {
        int [] row = new int[m];
        int [] col = new int[n];

        for(int a[] : indices)
        {
            row[a[0]]++;
            col[a[1]]++;
        }
        int res=0;
        for(int i = 0;i<m;i++)
        {
            for(int j =0 ;j<n;j++)
            {
                if(row[i] + col[i]%2 !=0)
                {
                    res++;
                }
            }
        }
        return res;
    }
}
