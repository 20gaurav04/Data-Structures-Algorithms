package Questions;
//https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/?envType=daily-question&envId=2025-03-14

public class PowerOf3 {
    public static void main(String[] args) {
        int n = 12;
        boolean res = checkPowersOfThree(n);
        System.out.println(res);
    }
        static boolean checkPowersOfThree(int n) {
                    while (n > 0) {
                        if (n % 3 == 2) {  // If any digit in base-3 is '2', return false
//                            here  12 in base 3 would be =      1 + 3^2  + 1 * 3^1 + 0 * 3^0 = 110 (only contains 11)
                            return false;
                        }
                        n /= 3;
                    }
                    return true;
                }
}
