package LoopsAndConditions;

public class Reverse{
    public static void main(String[] args)
    {
        int n = 1234665;

        int temp=0,rem;

        while(n>0)
        {
            rem = n%10;
            n = n/10;
            temp=temp*10+rem;
        }
        System.out.print(temp);
    }
}