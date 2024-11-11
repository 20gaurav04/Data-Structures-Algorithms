package Questions;

public class PrimeSubtractionOperation {
    public static void main(String[] args) {
        int[] arr = {4, 9, 6, 10};
        boolean res = primeSubOperation(arr);
        System.out.println(res); // Expected output based on array
    }

        static  boolean primeSubOperation(int[] nums) {
            int prev = 0;

            for (int n : nums) {
                int upperBound = n - prev; // non-inclusive

                int largestPrime = 0;
                for (int i = upperBound - 1; i >= 2; i--) {
                    if (isPrime(i)) {
                        largestPrime = i;
                        break;
                    }
                }

                if (n - largestPrime <= prev) {
                    return false;
                }
                prev = n - largestPrime;
            }

            return true;
        }
        static boolean isPrime(int n) {
            if (n < 2) return false;
            for (int f = 2; f * f <= n; f++) {
                if (n % f == 0) return false;
            }
            return true;
        }
    }

