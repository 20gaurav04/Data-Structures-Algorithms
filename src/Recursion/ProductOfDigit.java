package Recursion;

public class ProductOfDigit {
    public static void main(String[] args) {
        System.out.println(func(1345));
    }
    static int func(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        return (n%10) * func(n/10);
    }
}
