package BackTracking;

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {
//       int res =  ways(3,3);
//        System.out.println(res);
//        ways1("",3,3);
        ArrayList<String> res = new ArrayList<>(ways2("",4,4));
        System.out.println(res);

    }
    static int ways(int r , int c)
    {
        if(r==1||c==1)
        {
            return 1;
        }
        int left= ways(r-1,c);
        int right  = ways(r,c-1);
        return left + right;
    }

    static void ways1(String p , int rows , int cols)
    {
        if(rows==1 && cols==1)
        {
            System.out.println(p);
            return;
        }
        if(rows>1)
        {
            ways1(p +'D',rows-1,cols);
        }
        if(cols>1)
        {
            ways1(p + 'R' , rows , cols-1);
        }

    }
    static ArrayList<String> ways2(String p , int rows , int cols)
    {

        if(rows==1 && cols==1)
        {
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }
        ArrayList<String> res = new ArrayList<>();
        if(rows>1)
        {
            res.addAll(ways2(p +'D',rows-1,cols));
        }
        if(cols>1)
        {
            res.addAll(ways2(p +'R',rows,cols-1));
        }
        return res;
    }
}
