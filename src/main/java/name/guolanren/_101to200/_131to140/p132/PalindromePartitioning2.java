package name.guolanren._101to200._131to140.p132;

/**
 * @link https://leetcode.com/problems/palindrome-partitioning-ii/
 * @author guolanren
 */
public class PalindromePartitioning2 {

    public int minCut(String s) {

        boolean[][] palindrome = new boolean[s.length()][s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = 0; j < s.length(); j++) {
                palindrome[i][j] = i >= j || palindrome[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
            }
        }

        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            dp[i] = dp[i - 1] + 1;
            for (int j = 0; j < i; j++) {
                if (palindrome[j][i]) {
                    dp[i] = j == 0 ? 0 : Math.min(dp[i], dp[j - 1] + 1);
                }
            }
        }
        
        return dp[s.length() - 1];
    }

}
