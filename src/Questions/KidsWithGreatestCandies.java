package Questions;
import java.util.Arrays;
import java.util.ArrayList;

public class KidsWithGreatestCandies {
    public static void main(String[] args) {
        int candies[] = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;

        // Find the maximum number of candies any kid has
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        ArrayList<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            res.add(candies[i] + extraCandies >= max);
        }
        return res;
    }
}
