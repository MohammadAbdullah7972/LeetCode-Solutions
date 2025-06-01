/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int bestBuy = prices[0];

        for(int i=1; i<prices.length; i++){
            if (prices[i] > bestBuy) {
                profit = Math.max(profit, prices[i]-bestBuy);
            } else {
                bestBuy = Math.min(prices[i], bestBuy);
            }
        }
        return profit;
    }
}
// @lc code=end

