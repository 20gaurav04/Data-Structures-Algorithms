package LoopsAndConditions;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String a = sc.nextLine();
        int n = sc.nextInt();

        // Check for numbers less than 2 (not prime)
        while (true) {
            if (a == "x" || a == "X") {
                break;
            } else {

                if (n < 2) {
                    System.out.println("Not a Prime Number");
                } else {
                    boolean isPrime = true; // Assume it's prime initially

                    // Check divisibility from 2 to sqrt(n)
                    for (int i = 2; i <= n / 2; i++) {
                        if (n % i == 0) {
                            isPrime = false; // If divisible, it's not prime
                            break; // Exit the loop early, no need to check further
                        }
                    }

                    // Print the result after all checks
                    if (isPrime) {
                        System.out.println(n + " is a Prime Number");
                    } else {
                        System.out.println(n + " is Not a Prime Number");
                    }
                }

            }
        }
    }}
