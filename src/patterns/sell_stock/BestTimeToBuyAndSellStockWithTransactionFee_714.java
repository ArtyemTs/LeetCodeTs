package patterns.sell_stock;

public class BestTimeToBuyAndSellStockWithTransactionFee_714 {
    public int maxProfit(int[] prices, int fee) {
        int hold = -Integer.MAX_VALUE;
        int notHold = 0;

        for (int price : prices) {
            int prevHold = hold;
            int prevNotHold = notHold;
// просто цена повышается на комиссию
            hold = Math.max(prevHold, prevNotHold - (price + fee));
            notHold = Math.max(prevNotHold, hold + price);
        }

        return notHold;
    }
}
