package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fun(5));

    }
    static int fun(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n * fun(n-1);
    }
}
