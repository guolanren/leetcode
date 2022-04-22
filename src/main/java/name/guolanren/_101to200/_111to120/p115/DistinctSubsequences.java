package name.guolanren._101to200._111to120.p115;

import java.util.Arrays;

/**
 * @link https://leetcode.com/problems/distinct-subsequences/
 * @author guolanren
 */
public class DistinctSubsequences {

    public int numDistinct(String s, String t) {
        if (t.length() > s.length()) {
            return 0;
        }
        int[] dp1 = new int[s.length() + 1];
        int[] dp2 = new int[s.length() + 1];
        Arrays.fill(dp1, 1);

        for (int i = 0; i < t.length(); i++) {
            dp2[i] = 0;
            for (int j = i; j < s.length(); j++) {
                if (t.charAt(i) == s.charAt(j)) {
                    dp2[j + 1] = dp1[j] + dp2[j];
                } else {
                    dp2[j + 1] = dp2[j];
                }
            }
            int[] swap = dp2;
            dp2 = dp1;
            dp1 = swap;
        }

        return dp1[s.length()];
    }

}
