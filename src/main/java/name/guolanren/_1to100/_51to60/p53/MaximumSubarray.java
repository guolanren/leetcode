package name.guolanren._1to100._51to60.p53;

/**
 * @link https://leetcode.com/problems/maximum-subarray/
 * @author guolanren
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        int maxSum = dp[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }

}
