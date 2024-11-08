package BitwiseOperators;

public class PowerOf2 {
    public static void main(String[] args) {
        int x = 10;
        boolean ans = (x&(x-1))==0;
        System.out.print(ans);

    }
}
