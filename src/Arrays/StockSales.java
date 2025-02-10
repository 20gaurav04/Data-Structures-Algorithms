package Arrays;

public class StockSales {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        int res = maxProfit(arr);
        System.out.println(res);
    }
    static int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minBuy) {
                minBuy = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minBuy);
            }
        }
        return maxProfit;
    }
}
