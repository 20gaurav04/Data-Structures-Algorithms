package LoopsAndConditions;

public class ArmstrongNum {
    public static void main(String[] args) {
        int x = 371;
        System.out.print(isArmstrong(x));
    }
    static boolean isArmstrong(int n)
    {
        int rem  , temp  , result=0;
        temp = n;
        if(temp<0)
        {
            return false;
        }
        while(temp>0)
        {
            rem= temp%10;
            result+= Math.pow(rem,3);
            temp/=10;
        }
        if(result==n)
        {
            return true;
        }
        return false;
    }
}
