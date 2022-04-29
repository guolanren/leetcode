package name.guolanren._101to200._121to130.p121;

/**
 * @link https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * @author guolanren
 */
public class BestTimeToBuyAndSellStock {

    /**
     * 都去掉
     */
    public int maxProfit(int[] prices) {
        int has = - prices[0];
        int hasNot = 0;
        for (int i = 1; i < prices.length; i++) {
            hasNot = Math.max(hasNot, has + prices[i]);
            has = Math.max(has, - prices[i]);
        }
        return hasNot;
    }

    /**
     * 去掉 used 维度
     */
    public int maxProfit2(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][1] = 0 - prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], - prices[i]);
        }
        return dp[prices.length - 1][0];
    }

    /**
     * day-has-used 三维度
     */
    public int maxProfit3(int[] prices) {
        int[][][] dp = new int[prices.length][2][2];
        dp[0][1][1] = 0 - prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0][1] = Math.max(dp[i - 1][0][1], dp[i - 1][1][1] + prices[i]);
            dp[i][1][1] = Math.max(dp[i - 1][1][1], dp[i - 1][0][0] - prices[i]);
        }
        return dp[prices.length - 1][0][1];
    }
}
