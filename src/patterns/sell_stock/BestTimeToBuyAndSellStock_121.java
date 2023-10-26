package patterns.sell_stock;

public class BestTimeToBuyAndSellStock_121 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            profit = Math.max(profit, price - min);
            min = Math.min(min, price);
        }
        return profit;
    }
}
