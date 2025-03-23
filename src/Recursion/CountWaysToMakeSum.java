package Recursion;
import java.util.Arrays;

public class CountWaysToMakeSum {
    public static void main(String[] args) {
        int sum = 4;
        int[] coins = {1, 2, 3};
        int res = ways(sum, coins, 0);
        System.out.println(res);
    }

    static int ways(int sum, int[] coins, int index) {
        if (sum == 0) return 1; // Found a valid way
        if (sum < 0) return 0;  // No valid way

        int count = 0;
        for (int i = index; i < coins.length; i++) {
            count += ways(sum - coins[i], coins, i); // Allow using the same coin
        }
        return count;
    }
}
