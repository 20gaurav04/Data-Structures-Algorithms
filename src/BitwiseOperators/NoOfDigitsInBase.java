package BitwiseOperators;

public class NoOfDigitsInBase {
    public static void main(String[] args) {
        int n = 6;
        int base =2;
        int digits = (int)(Math.log(n)/Math.log(base)) +1;
        System.out.println(digits);
    }
}
