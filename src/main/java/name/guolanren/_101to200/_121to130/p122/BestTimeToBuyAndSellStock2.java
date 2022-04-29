package name.guolanren._101to200._121to130.p122;

/**
 * @link https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * @author guolanren
 */
public class BestTimeToBuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        int has = - prices[0];
        int hasNot = 0;
        for (int i = 1; i < prices.length; i++) {
            hasNot = Math.max(hasNot, has + prices[i]);
            has = Math.max(has, hasNot - prices[i]);
        }
        return hasNot;
    }

    /**
     * day-has 二维度
     */
    public int maxProfit2(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][1] = - prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[prices.length - 1][0];
    }

}
