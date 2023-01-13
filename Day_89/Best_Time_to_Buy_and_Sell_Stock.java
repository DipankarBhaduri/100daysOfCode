package Day_89;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        int[] prices = { 7, 6, 4, 3, 1 };
        int profit = s2.maxProfit(prices);
        System.out.println(profit);
    }
}

class Solution2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            int ithDay = prices[i];
            if (ithDay < lowestPrice) {
                lowestPrice = ithDay;
            }
            maxProfit = Math.max(maxProfit, ithDay - lowestPrice);
        }
        return maxProfit;
    }
}