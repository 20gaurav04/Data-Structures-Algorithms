package Basics;

public class PnC {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println("Permutation :" + fact(n)/fact(n-r));
        System.out.println("Combination : " + fact(n) / (fact(r) * fact(n - r)));



    }
    static int fact(int a)
    {
        if(a==0 || a==1) return 1;
        return a*fact(a-1);
    }
}
