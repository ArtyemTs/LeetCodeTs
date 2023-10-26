package patterns.sell_stock;

public class BestTimeToBuyAndSellStockII_122 {
    public int maxProfit(int[] prices) {
        // It is impossible to sell stock on first day, set -infinity as initial value for cur_hold
        int hold = -Integer.MAX_VALUE; //баланс когда у нас есть акции
        int notHold = 0; // баланс когда у нас нет акций

        for (int price : prices) {
            int prevHold = hold, prevNotHold = notHold;
            //max(keep holding stock, or just buy stock & hold today)
            //max( DP[Previous Hold], DP[previous NotHold] - stock price)
            // either keep hold, or buy in stock today at stock price
            hold = Math.max(prevHold, prevNotHold - price);
            // max(keep cash, or just sell out stock today)
            //max( DP[Previous NotHold], DP[previous Hold] + stock price)
            // either keep not-hold, or sell out stock today at stock price
            notHold = Math.max(prevNotHold, prevHold + price);
        }
        // maximum profit must be in not-hold state
        return notHold;
    }
    //     int profit = 0;
    //     int min = prices[0];
    //     int current = prices[0];
    //     boolean isHigthTrend = false;

    //     for (int i = 1; i < prices.length; i++) {
    //       if (prices[i] < current) {
    //         profit += current - min;
    //         min = prices[i];
    //         isHigthTrend = false;
    //       } else {
    //         isHigthTrend = true;
    //       }
    //       current = prices[i];
    //     }

    //     return isHigthTrend ? (profit + (current - min)) : profit;
    // }
}
