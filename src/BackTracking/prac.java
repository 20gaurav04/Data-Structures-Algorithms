package BackTracking;

public class prac {
    public static void main(String[] args) {
        allPaths("",3,3);
    }
    static void allPaths(String s , int rows , int cols)
    {
        if(rows == 0 && cols==0)
        {
            System.out.println(s);
            return;
        }
        if(rows>0)
        {
            allPaths(s+"D",rows-1,cols);
        }
        if(cols>0)
        {
            allPaths(s+"R",rows,cols-1);
        }
    }
}
