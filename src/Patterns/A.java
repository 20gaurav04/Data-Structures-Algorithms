package Patterns;

public class A {
    public static void main(String[] args) {
        int n =6;
        fun(n);
    }
    static void fun(int n)
    {
        for(int i = n ; i>0;i--)
        {
            System.out.print("*");
        }
        for(int j = 2;j<n;j++)
        {
            System.out.print("*");
        }
    }
}
