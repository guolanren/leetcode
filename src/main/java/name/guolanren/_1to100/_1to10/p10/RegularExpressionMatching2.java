package name.guolanren._1to100._1to10.p10;

/**
 * @link https://leetcode.com/problems/regular-expression-matching/
 * @author guolanren
 */
public class RegularExpressionMatching2 {

    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;

        for (int i = 2; i < p.length() + 1; i++) {
            dp[0][i] = '*' == p.charAt(i - 1) && dp[0][i - 2];
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if ('*' == p.charAt(j)) {
                    dp[i + 1][j + 1] = (dp[i + 1][j - 1]) || (('.' == p.charAt(j - 1) || s.charAt(i) == p.charAt(j - 1)) && dp[i][j + 1]);
                } else {
                    dp[i + 1][j + 1] = ('.' == p.charAt(j) || s.charAt(i) == p.charAt(j)) && dp[i][j];
                }
            }
        }
        return dp[s.length()][p.length()];
    }

}