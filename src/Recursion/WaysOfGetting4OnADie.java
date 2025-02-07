package Recursion;
import java.util.ArrayList;

class WaysOfGetting4OnADie
{
    public static void main(String[] args) {
//        ways("",4);
        ArrayList<String> res = ways("",4);
        System.out.println(res);

    }
//    static void ways(String p , int target)
//    {
//        if(target==0)
//        {
//            System.out.println(p);
//            return;
//        }
//        for(int i = 1 ; i<=6 && i<=target ; i++)
//        {
//            ways(p+i , target-i);
//        }
//    }

//    Returning As An ArrayList
    static ArrayList<String> ways(String s , int target)
    {
        ArrayList<String> res = new ArrayList<>();

        if(target==0)
        {
            res.add(s);
            return res;
        }
        for(int i  = 1 ; i<=6 && i<=target ; i++)
        {
            res.addAll(ways(s+i,target-i));
        }
        return res;
    }
}