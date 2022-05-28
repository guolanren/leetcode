package name.guolanren._101to200._131to140.p139;

import java.util.List;

/**
 * @link https://leetcode.com/problems/word-break/
 * @author guolanren
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i < dp.length; i++) {
            for (String word : wordDict) {
                int wordLen = word.length();
                if (i - wordLen >= 0) {
                    if (dp[i] = dp[i - wordLen] && s.substring(i - wordLen, i).equals(word)) {
                        break;
                    }
                }
            }
        }
        return dp[s.length()];
    }

}
