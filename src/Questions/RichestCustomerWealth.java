package Questions;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] accounts = {
                {1,2}
                ,{3,4}
        };
        System.out.print("MAX BALANCE :"+" "+maxBalance(accounts));
    }
    static int maxBalance(int [][] accounts)
    {
        int maxBal = Integer.MIN_VALUE;
        for(int[] ints : accounts)
        {
            int bal = 0;
            for(int anInt :ints)
            {
                bal=bal+anInt;
            }
            if(bal>maxBal)
            {
                maxBal=bal;
            }
        }
        return maxBal;
    }

}
