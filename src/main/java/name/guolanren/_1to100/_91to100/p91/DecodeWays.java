package name.guolanren._1to100._91to100.p91;

/**
 * @link https://leetcode.com/problems/decode-ways/
 * @author guolanren
 */
public class DecodeWays {

    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == '1') {
                dp[i + 1] += dp[i - 1];
            } else if (s.charAt(i - 1) == '2' && Character.getNumericValue(s.charAt(i)) <= 6){
                dp[i + 1] += dp[i - 1];
            }

            if (s.charAt(i) != '0') {
                dp[i + 1] += dp[i];
            }

        }


        return dp[s.length()];
    }

}
