package name.guolanren._1to100._61to70.p70;

/**
 * @link https://leetcode.com/problems/climbing-stairs/
 * @author guolanren
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

}
