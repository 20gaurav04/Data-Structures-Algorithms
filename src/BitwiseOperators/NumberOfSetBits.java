package BitwiseOperators;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int  n = 6;
        int setBits =0;

        for(int i = 0;i<32;i++)
        {
            if((n&(1<<i))!=0)
            {
                setBits++;
            }
        }
        System.out.println(setBits);
    }
}
