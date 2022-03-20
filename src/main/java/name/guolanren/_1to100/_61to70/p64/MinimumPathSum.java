package name.guolanren._1to100._61to70.p64;

/**
 * @link https://leetcode.com/problems/minimum-path-sum/
 * @author guolanren
 */
public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        int m = grid[0].length;
        int n = grid.length;
        int[][] dp = new int[m + 1][n + 1];

        dp[1][1] = grid[0][0];
        for (int i = 2; i <= m; i++) {
            dp[i][1] = dp[i - 1][1] + grid[0][i - 1];
        }
        for (int i = 2; i <= n; i++) {
            dp[1][i] = dp[1][i - 1] + grid[i - 1][0];
        }

        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[j - 1][i - 1];
            }
        }

        return dp[m][n];
    }

}
