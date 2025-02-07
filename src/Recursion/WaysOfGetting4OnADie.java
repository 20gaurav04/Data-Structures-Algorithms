package Recursion;

class WaysOfGetting4OnADie
{
    public static void main(String[] args) {
        ways("",4);

    }
    static void ways(String p , int target)
    {
        if(target==0)
        {
            System.out.println(p);
            return;
        }
        for(int i = 1 ; i<=6 && i<=target ; i++)
        {
            ways(p+i , target-i);
        }
    }
}