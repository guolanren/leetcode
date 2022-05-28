package name.guolanren._101to200._131to140.p140;

import java.util.ArrayList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/word-break-ii/
 * @author guolanren
 */
public class WordBreak2 {

    List<String> res = new ArrayList<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        wordBreak(s, s.length(), 0, wordDict, "");
        return res;
    }

    private void wordBreak(String s, int length, int index, List<String> wordDict, String maybe) {
        if (index == length) {
            res.add(maybe.trim());
            return;
        }
        for (String word : wordDict) {
            int to = index + word.length();
            if (to <= length && s.substring(index, to).equals(word)) {
                wordBreak(s, length, to, wordDict, maybe + word + " ");
            }
        }
    }

}
