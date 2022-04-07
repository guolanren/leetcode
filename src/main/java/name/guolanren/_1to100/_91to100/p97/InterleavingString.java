package name.guolanren._1to100._91to100.p97;

/**
 * @link https://leetcode.com/problems/interleaving-string/
 * @author guolanren
 */
public class InterleavingString {

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        boolean[] dp = new boolean[s2.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s2.length(); i++) {
            if (s2.charAt(i - 1) == s3.charAt(i - 1)) {
                dp[i] = true;
            } else {
                break;
            }
        }

        for (int i = 1; i <= s1.length(); i++) {
            boolean left = dp[0] && s1.charAt(i - 1) == s3.charAt(i - 1);
            dp[0] = left;
            for (int j = 1; j <= s2.length(); j++) {
                dp[j] = (left && s2.charAt(j - 1) == s3.charAt(i + j - 1))
                        || (dp[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
                left = dp[j];
            }
        }
        return dp[s2.length()];
    }

}
