package Questions;
import java.math.BigInteger;
//https://leetcode.com/problems/factorial-trailing-zeroes/
public class TrailingZeroesInFactorial {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(trailingZeroes(n));
    }

    static int trailingZeroes(int n) {
        int totalZeroes = 0;
       while(n>0)
       {
           totalZeroes += n/5;
           n/=5;
       }
       return totalZeroes;

    }
}